SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-azure-mgmt-recoveryservicesbackup-6.0.0-1.1.noarch.rpm"
RPM_HASH = "846617e99a39e5e14d5686fd944b6a9c0f94dfea381bba2f6fd5b83009bb2cd34e2a0b3a3372cf4b8e20585870c9fc5f562c1db1ae0f0dc31034cf8ceb8b4f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-recoveryservicesbackup) \
python39-azure-mgmt-recoveryservicesbackup \
python3dist(azure-mgmt-recoveryservicesbackup)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
