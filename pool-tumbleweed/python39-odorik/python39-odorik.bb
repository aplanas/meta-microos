SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python39-odorik-0.5-6.6.noarch.rpm"
RPM_HASH = "091352b5e3bf91fea8fe644b86fba0b604ccc355d631201be63074e389ecd7db8ca312bab403b1f1f5ba2b4036dabd83ee3c7d8ab381b0eea58261a8eba36b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-odorik \
python39-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-xdg \
update-alternatives"

inherit rpm
