SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-dnsresolver-1.0.0-1.4.noarch.rpm"
RPM_HASH = "da12efffde7d07e3f7f86615001867ee5c14dfe531976546335d1ede2f82dedd960699e3decddc292f3878bcf93fbcd0c01bcc368b5e77ecca051f80415a7fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dnsresolver \
python39-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
