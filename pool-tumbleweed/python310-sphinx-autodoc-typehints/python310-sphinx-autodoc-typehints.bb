SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python310-sphinx-autodoc-typehints-1.19.2-2.1.noarch.rpm"
RPM_HASH = "9eda129427d6730c855ca88411d0c60ecd5b242cf7a94da5f983661f6aeed6de7d18498a4e1363de530249f672cdfd1918c75d3d8287275711a5c3800aaa3a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-autodoc-typehints \
python310-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
