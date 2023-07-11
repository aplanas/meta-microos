SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python310-edk2toollib-0.10.13-1.5.noarch.rpm"
RPM_HASH = "8c05828a44164dc6c57af48402135c2f668b9a6d36488c3d324c28c936d86f142d38dc50a5f16814705ad2677bdb5951b58d9e993c80844e009346dc8d30509d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-edk2-pytool-library \
python310-edk2toollib \
python3dist-edk2-pytool-library"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
