SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python311-odorik-0.5-6.6.noarch.rpm"
RPM_HASH = "7d501ac1546971d74bac01d8a68eb2fc51c404fbee42109d59bccf75232837de596b88eb3977fa79484059fcc60244be097d9b2825a7fc2b3f359bb18a59b711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-odorik \
python3.11dist-odorik \
python311-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-xdg \
update-alternatives"

inherit rpm
