SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python39-pymarc-4.2.2-1.3.noarch.rpm"
RPM_HASH = "50e4b70f91eec81880063f8d5092582b16f4a64a1ac3993ca8c2ab0227f9b36c9f6fca3010a7ebc66552eda0791b26800bc22bc88df324c5f62c90f35f14c33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymarc \
python39-pymarc \
python3dist-pymarc"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
