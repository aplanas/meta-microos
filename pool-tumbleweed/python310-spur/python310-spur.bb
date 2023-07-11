SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python310-spur-0.3.22-1.6.noarch.rpm"
RPM_HASH = "762eded2dbb14b54a33ecaf4e331f47ccc862aaabfde9a7035e63e95f9b1a91113f7ec827a141c16f3ad650f2d2acffc2f49f13147b2c0d5c747fb19799e9312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spur \
python310-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
