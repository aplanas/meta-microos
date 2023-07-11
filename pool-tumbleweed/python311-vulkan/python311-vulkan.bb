SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python311-vulkan-1.1.99.1-1.17.noarch.rpm"
RPM_HASH = "d6d4c64b1bcad55ad314d47893403017542db56b8ab9f9b61aeed598740c2fb562996a91b5a447e04a86ad68f2abe26e6fce2d898f5ffe98d5ef7a7c758d1a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulkan \
python3.11dist-vulkan \
python311-vulkan \
python3dist-vulkan"

RDEPENDS:${PN} += "python-abi \
python311-cffi \
vulkan"

inherit rpm
