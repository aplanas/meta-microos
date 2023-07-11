SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python39-azure-mgmt-containerinstance-10.1.0-1.2.noarch.rpm"
RPM_HASH = "32404c63351b6e18638267b514b196dfe1846d7d4289c2b6e650c675915a8e4f14333c1e337297904d6c1123de4c5e619bc15973581d401652f80ee005b993bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-containerinstance \
python39-azure-mgmt-containerinstance \
python3dist-azure-mgmt-containerinstance"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
