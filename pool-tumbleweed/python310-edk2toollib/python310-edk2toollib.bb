SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python310-edk2toollib-0.10.13-1.3.noarch.rpm"
RPM_HASH = "a29f3e86922ea6dab762bdfabcf76c66edcb5ccdaaca95b65d27d577aae3d0ce4595a63298ceda658b8dfbecc7e0cc7994253cabdc83b3bf32a3dc36213a0883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toollib \
python3.10dist(edk2-pytool-library) \
python310-edk2toollib \
python3dist(edk2-pytool-library)"

RDEPENDS:${PN} += "/bin/sh \
python(abi)"

inherit rpm
