SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-serialconsole-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "2729fb98a9a364aa4589d15e83594dfa30ad9ab47104dc8d510bc1f0c6c16fd17a4f9a80c5431849589b773b3c68305ec2d61147f5fff640e7bf6ea484582521"
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
