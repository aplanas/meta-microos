SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.9"

RPM_NAME = "python310-sphinxcontrib-serializinghtml-1.1.9-1.1.noarch.rpm"
RPM_HASH = "91fe5db3e85e4ef168e2fa158471abf1667cb08d9c0ae34ee987ce4cc7f8aba14afdaf5915de9fb3946d05b2395b3e2c911a9df4ae559398bafb4b50cc04e1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-serializinghtml \
python310-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
