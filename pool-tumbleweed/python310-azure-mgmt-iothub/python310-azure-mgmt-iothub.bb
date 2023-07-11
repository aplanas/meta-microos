SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-azure-mgmt-iothub-2.4.0-1.2.noarch.rpm"
RPM_HASH = "32d73ef1ac2bf4ee56abb9948cd88c921c22a11ae3bad6d5e47f547bdff2553bfe149083a81161a78712cabccc40c5350cdb6d9feeb15a2b195c644ba3137731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-iothub \
python310-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
