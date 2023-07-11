SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python311-click-option-group-0.5.6-1.1.noarch.rpm"
RPM_HASH = "cca36fcbde6606700a1b9afc856f711b7327a98d7e57dfffd895bda546c2607300ee3ce129929033f759e94f37388322b8d48a28443407c37ac01e742285596c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-option-group \
python3.11dist-click-option-group \
python311-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
