SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python310-sphinx-autodoc-typehints-1.19.2-1.4.noarch.rpm"
RPM_HASH = "0e85367ccad046b803cbb4e6f2430a9e779d2931258c9df60e95bdb30d37b2a578df53e1ae81afa473ea0b25b644a2666beecf293863fbe50cad1fbefdf97af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autodoc-typehints \
python3.10dist-sphinx-autodoc-typehints \
python310-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
