SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "4.2.2"

RPM_NAME = "python311-pymarc-4.2.2-1.1.noarch.rpm"
RPM_HASH = "509ee0dee0b133283aebd8775bcee5cd21fd4df30d2cc4b8d79fb187de5e760366b64ee8055b8b96c33fdeb35b7edfc9fffa4071a7c55b241771772e7657ff00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymarc) \
python311-pymarc \
python3dist(pymarc)"

RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
