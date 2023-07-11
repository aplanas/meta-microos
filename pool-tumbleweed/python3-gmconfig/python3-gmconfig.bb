SUMMARY = "JSON based configuration file manager for Python"
DESCRIPTION = "JSON based configuration file manager for Python 3.x."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "python3-gmconfig-1.0.1-1.12.noarch.rpm"
RPM_HASH = "eb820160b2b1ce4b62f184e54b87b342bef4183b6391e47ed6e6d804fcaab3317d7d8cc6f7d9251904d46ef8e428002cd6565d7d4d90e8f0ec5e1bcae4870d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gmconfig \
python3.11dist-gmconfig \
python3dist-gmconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
