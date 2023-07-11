SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python39-edk2toollib-0.10.13-1.5.noarch.rpm"
RPM_HASH = "cfcb21a7d77bae02ce6ac9e57224c1dd2d4b62d66b501ff001a000814f0200a024f65baae8e87e7a5fba151ab5cce5d5cc3042fad893ed4f7cdc43fc09c69bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-edk2-pytool-library \
python39-edk2toollib \
python3dist-edk2-pytool-library"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
