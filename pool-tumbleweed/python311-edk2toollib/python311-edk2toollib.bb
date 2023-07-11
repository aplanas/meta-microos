SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python311-edk2toollib-0.10.13-1.5.noarch.rpm"
RPM_HASH = "00497340132f9ec340f3eed35f3e02296ddf6925b16c284412618fc55450e75f7d5807c2bdff9a1c2ccbbf230fe03d4509a2ce9be0742b5568a5ea78fe428813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toollib \
python3.11dist-edk2-pytool-library \
python311-edk2toollib \
python3dist-edk2-pytool-library"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
