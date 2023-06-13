SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python311-azure-mgmt-containerinstance-10.1.0-1.1.noarch.rpm"
RPM_HASH = "b36118cb3bc037902b54c001c7686cee3da22f21f2c8a02c5091cd5469f928957e87cf580b1d9033838dd7402188398daafc4eb2f41cb533ae2ee71b40dfdf07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-containerinstance) \
python311-azure-mgmt-containerinstance \
python3dist(azure-mgmt-containerinstance)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
