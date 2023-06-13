SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python39-azure-mgmt-containerinstance-10.1.0-1.1.noarch.rpm"
RPM_HASH = "fe4eeb63a489a4d7c6666242b87d9c3631ac769565144a95a151c2d129beb96cf15ccafe7940c809bedd33fc95410ef2063d5250c696f7d448867eca6169e65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-containerinstance) \
python39-azure-mgmt-containerinstance \
python3dist(azure-mgmt-containerinstance)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
