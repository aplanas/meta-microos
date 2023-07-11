SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python310-devpi-common-3.7.2-3.3.noarch.rpm"
RPM_HASH = "a3b87054b381fa20c406a31f4795f2ae9ac092b11337125d099b213f4a6ed901af28ddda7b36dcac9d909c9fba679398b556e586333d94555793899da9392ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-devpi-common \
python310-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-py \
python310-requests"

inherit rpm
