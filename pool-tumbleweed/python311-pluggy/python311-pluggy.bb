SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pluggy-1.0.0-2.3.noarch.rpm"
RPM_HASH = "4d74987f63ca6f8d9b2179ab5bab2e426bc66d9a940716d98bf67db3c25600213626f95fdc37d063f6f4126846a0b306841d559a5cd50634d60f0704c4ef2cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluggy \
python3.11dist-pluggy \
python311-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
