SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python310-furl-2.1.3-3.1.noarch.rpm"
RPM_HASH = "7a850c96b4b872af4cd74e13347dd46f4600f8b0688459ff52c84e7f9a49b25c69394728be4314c1dc7c1451d856f77c69843b3ba9f5287fa75f584c4a1b11ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-furl \
python310-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python310-orderedmultidict \
python310-six"

inherit rpm
