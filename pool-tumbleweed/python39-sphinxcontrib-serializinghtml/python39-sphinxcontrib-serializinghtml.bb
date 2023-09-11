SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.9"

RPM_NAME = "python39-sphinxcontrib-serializinghtml-1.1.9-1.1.noarch.rpm"
RPM_HASH = "2e8e3c03009e73462b7e7ccfbef8c937de24d2a80588daa4b79005133fc87b39bc1499a0bf1444818fc4ab908c5785e823aad55361fb8e65c5297cfab46e98a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-serializinghtml \
python39-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
