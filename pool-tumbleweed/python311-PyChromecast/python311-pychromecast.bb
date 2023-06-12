SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python311-PyChromecast-13.0.7-1.1.noarch.rpm"
RPM_HASH = "c54ad40ccf6a0f416c591a4b74052edddd8c144b456f67e65755871fc7e48793bf3e83b8719cae8f598a33cbc0f778d40176427508a33790a3492d5829f5b50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pychromecast) \
python311-PyChromecast \
python3dist(pychromecast)"
RDEPENDS:${PN} += "python(abi) \
python311-casttube \
python311-protobuf \
python311-zeroconf"

inherit rpm
