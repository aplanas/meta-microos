SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python39-sphinx-autodoc-typehints-1.19.2-2.1.noarch.rpm"
RPM_HASH = "10246d5344890cfd9f78154f3314bf42bf911309f79498403465ac072b4f71692ec9cc8f3af568585d7c5e723723e66621cee0cd85589465e94646a181f0b45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-autodoc-typehints \
python39-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
