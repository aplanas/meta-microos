SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python311-sphinx-autodoc-typehints-1.19.2-1.6.noarch.rpm"
RPM_HASH = "38712730421b7e168c527f2633c80a764df13334041b5a69a5946430eab82c788cb92f45bc6e07a83bd7734b3b924f2df43eaeb30d19f43363be944d2316045d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autodoc-typehints \
python3.11dist-sphinx-autodoc-typehints \
python311-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
