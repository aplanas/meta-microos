SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python310-nptyping-2.4.1-1.5.noarch.rpm"
RPM_HASH = "f3408142e0796450a695c9db3b09bba66f6c2f6869da5a3c24ae6d2f70f69fb9f33577bcefa0da5cde761e007be683979a6feee271f8ac6b02183d1ab2fb767e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nptyping \
python310-nptyping \
python3dist-nptyping"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
