SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python39-PyChromecast-13.0.7-1.1.noarch.rpm"
RPM_HASH = "c54c0a1eeda8a680028a6771c0d44d74de50c8b2aec60c7bb78d55cd7cd6d9fed755d0b83038366e188d4e0457916c6a55cdabd76ace010f083be10f6fd5c485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pychromecast \
python39-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python39-casttube \
python39-protobuf \
python39-zeroconf"

inherit rpm
