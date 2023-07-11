SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python311-sphinxcontrib-serializinghtml-1.1.5-2.2.noarch.rpm"
RPM_HASH = "12db2fbe1f7b1c00e2eabfa28c6e774d0abaa394225a0942c9fd1f1fee1a7399e7f6ec5f4f8f32d94899796fcc8a9a8c62106af2628b4cfcc5d208f9bd39e91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-serializinghtml \
python3.11dist-sphinxcontrib-serializinghtml \
python311-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
