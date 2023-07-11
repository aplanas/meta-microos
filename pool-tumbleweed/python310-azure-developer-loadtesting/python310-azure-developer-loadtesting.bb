SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-developer-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "4b76b27b4a5d68fdd42615ebf396424573b21fb6e3cfcf788239280b6f7a77ff131babf500a81ed0b6d1a04d228cdaff717dffe7cb478522ad8371161515b8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-developer-loadtesting \
python310-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
