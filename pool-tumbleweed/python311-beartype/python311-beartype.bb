SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python311-beartype-0.15.0-1.1.noarch.rpm"
RPM_HASH = "edd278076b076af4e707c12f223de99624e2d5374946a8ea542bf3d03f5abc0e6a0a3e27bdabd4be7e18ffbdb1caa87aeb3fb0ac15a24729f46577de5defb2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beartype \
python3.11dist-beartype \
python311-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
