SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-developer-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "3b57f512cd188ef88cf6a240818364464b2836013deaa0081f1da39d026f89e12d5a7f93fd16fa24be0503ef9bd062f781d31cc6704cf5f876f3f342e186ddd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-developer-loadtesting \
python3.11dist-azure-developer-loadtesting \
python311-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
