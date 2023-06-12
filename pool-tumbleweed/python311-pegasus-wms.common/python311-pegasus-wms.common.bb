SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python311-pegasus-wms.common-5.0.3-2.3.noarch.rpm"
RPM_HASH = "cd783be5147230bd81777a741b9b355e82e2d3224e82eb101c0fdd4631a17636be6b71a44b18aad43ba47b9eb6d48689bfec69bcac56a256a7e58d29f15a6b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pegasus-wms.common) \
python311-pegasus-wms.common \
python3dist(pegasus-wms.common)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML"

inherit rpm
