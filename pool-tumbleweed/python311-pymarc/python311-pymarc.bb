SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python311-pymarc-4.2.2-1.3.noarch.rpm"
RPM_HASH = "80812c2d8c294e58d9c6be803e78efa075277359ab03e644ecd337f096ed6626c07bf9073bc95534809035ad6d89282445803afb6444425593608bcd618e7d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymarc \
python3.11dist-pymarc \
python311-pymarc \
python3dist-pymarc"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
