SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python311-PyChromecast-13.0.7-1.2.noarch.rpm"
RPM_HASH = "ed3cedd2b275811ebd43118630d9e7c2c3dd8f6b0462712ee9abbc1b9878b9fb02527b655894ca416a966588ee8af3bc74d7fbb671d59abf2cde976eca789aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChromecast \
python3.11dist-pychromecast \
python311-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python311-casttube \
python311-protobuf \
python311-zeroconf"

inherit rpm
