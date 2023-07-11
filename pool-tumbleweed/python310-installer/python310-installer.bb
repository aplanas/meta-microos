SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-installer-0.7.0-2.3.noarch.rpm"
RPM_HASH = "3602659efb628855756cfe385a977285122b1c0b613a7bace1e0710d3e6113d962293856d424bf525e4e459f3aee84cd7dfa63d9ab364e0184ee20f985d18a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-installer \
python310-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
