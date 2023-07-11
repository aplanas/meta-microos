SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python310-PyChromecast-13.0.7-1.2.noarch.rpm"
RPM_HASH = "d70b35dbfd035012c59442e5e5c76becb7f5c3bcf2f5b819de765d2d070de95528db7a1ea719a8ca1f9fb5f5603106e2de03525742308ec9ccc472e85d1b6bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pychromecast \
python310-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python310-casttube \
python310-protobuf \
python310-zeroconf"

inherit rpm
