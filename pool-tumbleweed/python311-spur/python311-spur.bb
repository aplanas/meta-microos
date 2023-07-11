SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python311-spur-0.3.22-1.6.noarch.rpm"
RPM_HASH = "a707406f0da2ce1a9a8ef8b960592c94e67714c1c94fb7a50874c8079341694538fb4605979749260a94ac3b17a8b045e83a10e0dfb52d07a47925c1b9d03aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spur \
python3.11dist-spur \
python311-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
