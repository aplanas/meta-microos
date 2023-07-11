SUMMARY = "Common files for Extras Plugins for DNF"
DESCRIPTION = "Common files for Extras Plugins for DNF, Python 3 version."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugins-extras-common-4.0.17-2.2.noarch.rpm"
RPM_HASH = "6388023bbc34a5b2f9531cc6a0de82ba1e9ae72df0ff7b1b4b5aed12966042b6dea98d52c961ac0c0743023e176b86e0b73145325780950a1c2e550e237b94a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-extras-common \
python3-dnf-plugins-extras-common"

RDEPENDS:${PN} += "python-abi \
python3-dnf"

inherit rpm
