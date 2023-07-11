SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python39-sphinxcontrib-serializinghtml-1.1.5-2.2.noarch.rpm"
RPM_HASH = "92b6a5b084075c9ae70072b31b576132c9ee36c1694d0d483036f8a55158d98f19f4324a740f253db1968ab5e51a1516ba2d838c69cfa118e7704947fd4adfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-serializinghtml \
python39-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
