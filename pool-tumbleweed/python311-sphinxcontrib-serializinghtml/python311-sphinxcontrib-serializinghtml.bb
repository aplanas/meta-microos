SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.9"

RPM_NAME = "python311-sphinxcontrib-serializinghtml-1.1.9-1.1.noarch.rpm"
RPM_HASH = "95f0ed86ccc0dd1564d084ecf671096a1c682c33af6e71d105b3ccbf761eb1bee817ec7be02a33f304ca8e61ba1e178858c16b55671d3ae1f87520da36399350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-serializinghtml \
python3.11dist-sphinxcontrib-serializinghtml \
python311-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
