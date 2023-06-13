SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python310-pymarc-4.2.2-1.1.noarch.rpm"
RPM_HASH = "8dce99c7f55ff4d8bb4651331ae21451a371de60f180b321f9073643d1a5d22148cb727d47bd5f61d51861af4feef8063849fceb1f8d89d290af2e35e508443b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymarc \
python3.10dist(pymarc) \
python310-pymarc \
python3dist(pymarc)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
