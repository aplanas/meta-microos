SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-serialconsole-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "1c9709fa9f8985de364fea11f28b3b5f5f373a253f9417531ccb44de5202a7a590485234a15f2b8681035070c20a7dc4377d68178620195e046cb86212c5a23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-serialconsole \
python39-azure-mgmt-serialconsole \
python3dist-azure-mgmt-serialconsole"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
