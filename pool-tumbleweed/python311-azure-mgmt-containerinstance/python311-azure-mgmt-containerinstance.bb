SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python311-azure-mgmt-containerinstance-10.1.0-1.2.noarch.rpm"
RPM_HASH = "8da7667483cadabfe41dc37b71827cca5dfa6f33e27e02fea531a04675ca4ea2fa715503ff7f2181b381773a98b4cbc16da98124d7048d03b7bfd22e888f1d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerinstance \
python3.11dist-azure-mgmt-containerinstance \
python311-azure-mgmt-containerinstance \
python3dist-azure-mgmt-containerinstance"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
