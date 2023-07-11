SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python39-PyChromecast-13.0.7-1.2.noarch.rpm"
RPM_HASH = "e93975b381f97d256f374cab3805ffa725fbafc8dc62964dd2f6df3885eac44460c96c315baa8f0367cb8acfd61793720d88abded3b574496bf9670df1136887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pychromecast \
python39-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python39-casttube \
python39-protobuf \
python39-zeroconf"

inherit rpm
