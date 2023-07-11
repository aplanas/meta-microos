SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-authres-1.2.0-2.1.noarch.rpm"
RPM_HASH = "93a92f6ac4a97358b486ee41bc997f1133d5098eddd84fa1ee63eb2619a695d021edaad1cb235158229dd0011e194aa8017828270b8781cf9bbddf77b8c93794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authres \
python3.11dist-authres \
python311-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
