SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python311-devpi-common-3.7.2-3.3.noarch.rpm"
RPM_HASH = "4f61bd3e83f5af6d010cac01c5569da773b1911bd19b31cf0e5641819b2ddbcc91e0210c63716402188a4f4ed5342f38c74803e814d481efb73e73222144f244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-common \
python3.11dist-devpi-common \
python311-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-py \
python311-requests"

inherit rpm
