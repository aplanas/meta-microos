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

RPM_NAME = "python311-azure-mgmt-core-1.4.0-1.2.noarch.rpm"
RPM_HASH = "1106aad396fe9e5b9c25c0cdf78eb214cca63e3da5464d12d87ef6e2b460cd3a286e5c31e153a95ef349d68af79905db257dd747b9ee18d5f3a003dde43f9607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-core \
python3.11dist-azure-mgmt-core \
python311-azure-mgmt-core \
python3dist-azure-mgmt-core"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
