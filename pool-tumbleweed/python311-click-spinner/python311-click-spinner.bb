SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-click-spinner-0.1.10-2.3.noarch.rpm"
RPM_HASH = "3dbbdf26f54dcad797f256a6a6b848d5f3f69ecc742919dfc7757c8a5d310f257ca1c029cbb58cbf0eb23bc655d510ed0c6dfb0ce50e9b33001b320baf6df77c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-spinner) \
python311-click-spinner \
python3dist(click-spinner)"
RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
