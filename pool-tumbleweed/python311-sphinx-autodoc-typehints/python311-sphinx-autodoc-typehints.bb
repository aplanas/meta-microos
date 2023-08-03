SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python311-sphinx-autodoc-typehints-1.19.2-2.1.noarch.rpm"
RPM_HASH = "c1fc927d56cfa80d34cb4dd4fb03ce58a7bf72935c2f87ea8fb144983a99947813fda6b5336ac10fe6b527e5c355ba9b7a26d8590d69f874068e0e31708007f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autodoc-typehints \
python3.11dist-sphinx-autodoc-typehints \
python311-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
