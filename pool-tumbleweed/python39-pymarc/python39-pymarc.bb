SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python39-pymarc-4.2.2-1.1.noarch.rpm"
RPM_HASH = "7779b72f348490b02039e60170ab91947fc16eb7654eacc6bd413278747100bd582666427a26e62363d6e36bfcf2b4c73e0a23ef90d7c97814a33a074d21306e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymarc) \
python39-pymarc \
python3dist(pymarc)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
