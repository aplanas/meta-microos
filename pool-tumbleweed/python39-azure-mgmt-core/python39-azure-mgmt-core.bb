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

RPM_NAME = "python39-azure-mgmt-core-1.4.0-1.2.noarch.rpm"
RPM_HASH = "becb0dd1e6ebf9af7834bed9b556d6b2122e1950d9639e5c8479b0497929734dd7bd47e81f01c0c4bfa28da68612bbadecfb178b045fb956ed90a9544344c559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-core \
python39-azure-mgmt-core \
python3dist-azure-mgmt-core"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
