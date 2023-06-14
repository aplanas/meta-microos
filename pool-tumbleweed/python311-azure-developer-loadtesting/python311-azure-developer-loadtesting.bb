SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-developer-loadtesting-1.0.0-1.2.noarch.rpm"
RPM_HASH = "5e28ed91196abaf3807d4436b267023ac408f65416a88b983f7b7117e3f1f1c1445c205d306d1c154bd1c7a41a479ecf3c754c61fe8e63b7f77de1ce7824b601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-developer-loadtesting \
python311-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
