SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-authres-1.2.0-1.13.noarch.rpm"
RPM_HASH = "d783d97e1082f174d8ce88ab684c41b8914655775ad2b5f1344a740db9efee7b957e647c5556829b9fdd9039f06157d1f1b56395c7ff517b07dc420af1e2c16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-authres \
python311-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
