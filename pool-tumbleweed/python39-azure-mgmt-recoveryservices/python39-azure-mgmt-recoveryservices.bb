SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-azure-mgmt-recoveryservices-2.4.0-1.2.noarch.rpm"
RPM_HASH = "45a59bfd3f2df59e959e17e64047807d94461ab32146daf55f48c1d9058e326d6178647442297d6f9ec36e303ddb2f4a50fea20b7df624c42b0159b27877b031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-recoveryservices \
python39-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
