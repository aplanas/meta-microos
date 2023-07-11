SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python311-MarkupPy-1.14-1.16.noarch.rpm"
RPM_HASH = "1dfeeb0be0f7bdb53937a67cb19d33aef05fe3e7f126edab6c0a1196dbfac62b8d61c9e17ab7de854003a865e357e5523835f1e8d99ad5a6a960345c0c971782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MarkupPy \
python3.11dist-markuppy \
python311-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
