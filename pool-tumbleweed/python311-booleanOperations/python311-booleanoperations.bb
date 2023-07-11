SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-booleanOperations-0.9.0-2.9.noarch.rpm"
RPM_HASH = "af33095b3d9ef6ec20d5faac03286abb90ab13d4a4599d0b28c6a07dd820c3948287734bfe1a8c7634c88956da1c5bc7a9369d9901136b8b1efecf17839790b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-booleanOperations \
python3.11dist-booleanoperations \
python311-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-pyclipper"

inherit rpm
