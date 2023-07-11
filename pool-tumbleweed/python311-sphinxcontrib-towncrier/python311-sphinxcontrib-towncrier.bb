SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python311-sphinxcontrib-towncrier-0.3.2a0-1.2.noarch.rpm"
RPM_HASH = "a246237a97be529fa80ff94189854e1588d5e0df657ca39f8131dd57be253414c82765546d89b9a944cac03849464f51a526ddd1454397a6008e58444f654bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-towncrier \
python3.11dist-sphinxcontrib-towncrier \
python311-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-towncrier"

inherit rpm
