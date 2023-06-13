SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python311-sphinx-autodoc-typehints-1.19.2-1.4.noarch.rpm"
RPM_HASH = "9faba58ab26189f0de4e74a1da13514c49686bd72665460ea0ac27c71a8055304692a13d74e2aa25b4b9de5bff2d70e8c8d9b149911529e558d97b46cf34601b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-autodoc-typehints) \
python311-sphinx-autodoc-typehints \
python3dist(sphinx-autodoc-typehints)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
