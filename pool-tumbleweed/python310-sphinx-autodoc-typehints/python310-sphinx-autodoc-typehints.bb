SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python310-sphinx-autodoc-typehints-1.19.2-1.6.noarch.rpm"
RPM_HASH = "05580d53c3e24ae1447998f46ab06364040199a1f1e3e709b10554981261d55244934d5b1485ac95a2b64c7f0a5285b71485445acec73fa2191d54f534398814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-autodoc-typehints \
python310-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
