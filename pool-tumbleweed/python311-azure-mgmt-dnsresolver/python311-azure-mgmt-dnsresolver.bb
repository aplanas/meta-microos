SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-dnsresolver-1.0.0-1.4.noarch.rpm"
RPM_HASH = "f3a9490f38a64973f5923184b9da121f8d85adfa9053954a7cfc2fd8eaa8f7f37e47ab6a2a6689e1a6723185a4f5cbb8fbc8643c926fdc300ff14cfc2ef758ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dnsresolver \
python3.11dist-azure-mgmt-dnsresolver \
python311-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
