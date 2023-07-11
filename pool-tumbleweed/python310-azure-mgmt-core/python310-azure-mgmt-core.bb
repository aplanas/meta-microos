SUMMARY = "Microsoft Azure Management Core Library"
DESCRIPTION = "This is the Microsoft Azure Management Core Library. \
 \
Azure management core library defines extensions to Azure Core that are specific \
to ARM (Azure Resource Management) needed when you use client libraries. \
 \
As an end user, you don't need to manually install azure-mgmt-core because it will \
be installed automatically when you install other SDKs."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-azure-mgmt-core-1.4.0-1.2.noarch.rpm"
RPM_HASH = "75ba2043928636d39f3e55d54f56fcaacfff62d18921dc225964924a1ac68ddd9b17fbd48f6b7fbbc619693d84670b9042c9eec815473d7cbc7d851633b263db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-core \
python310-azure-mgmt-core \
python3dist-azure-mgmt-core"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
