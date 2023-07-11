SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python311-pegasus-wms.common-5.0.3-2.5.noarch.rpm"
RPM_HASH = "bf577e51096ce9e031ace358fb16d840669be73f640c56220337df928f3098b9f1d993e5deebd07b6777062f896f23b4a07cbc016d49175f81ad9b7035bb6c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.common \
python3.11dist-pegasus-wms.common \
python311-pegasus-wms.common \
python3dist-pegasus-wms.common"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
