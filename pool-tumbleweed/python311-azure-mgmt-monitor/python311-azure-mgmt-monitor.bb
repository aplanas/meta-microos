SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python311-azure-mgmt-monitor-6.0.2-1.1.noarch.rpm"
RPM_HASH = "fd970faea088012eee9c1f55f42e109224026164ce019c3bd4d9deef3fac28ef7719340aebd24257bac3cd9d924d6112e1d1b6d259f868a4ac2e8c07028bbfee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitor \
python3.11dist-azure-mgmt-monitor \
python311-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
