SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python310-pymarc-4.2.2-1.3.noarch.rpm"
RPM_HASH = "aeb780c00cb7fb5af6cfbe95fbab1bd01226ee846b9217feba95634b3790b0f1ebd6d648dd1efd937b9b879a4e24c133c9cdbc061bc909a52f34c5c4b5127ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymarc \
python310-pymarc \
python3dist-pymarc"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
