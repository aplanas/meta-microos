SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python310-furl-2.1.3-2.1.noarch.rpm"
RPM_HASH = "350b3be9f8171e748e70e3ff7e1c64cb4b5a7b6ad8a6741f355e6ede640f829baac7ee2361084c26b64d6bdff75537438804e7c20a366d7f2f9f53a80b003b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-furl \
python3.10dist(furl) \
python310-furl \
python3dist(furl)"

RDEPENDS:${PN} += "python(abi) \
python310-orderedmultidict \
python310-six"

inherit rpm
