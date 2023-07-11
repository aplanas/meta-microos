SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python39-sphinx-autodoc-typehints-1.19.2-1.6.noarch.rpm"
RPM_HASH = "2b636dad70f1267514649ff2178410e7aa16ba55af923dfd679933ee5f083ca5b7c8d7e3c4ea1a28ce41971b3306f0fbd139cd9fe9a8e55f83638b4290e3819f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-autodoc-typehints \
python39-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
