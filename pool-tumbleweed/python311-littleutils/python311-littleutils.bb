SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-littleutils-0.2.2-2.2.noarch.rpm"
RPM_HASH = "6319130112aa7693e7c9b748ba41e9a7797842edb236c8229e9379cfad14e8b4588d208f1b727f40b8bf0a501b2c7ae135aac6328f0e16925c406281db821650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-littleutils \
python3.11dist-littleutils \
python311-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
