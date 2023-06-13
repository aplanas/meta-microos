SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python311-flake8-builtins-2.1.0-1.3.noarch.rpm"
RPM_HASH = "7e30bbe3493cdd503d01c55f7deed9a78ec4e69cf5e4f54452e45d6e74a26810326ca636e9f29b03bb710c153b8b14a33825c881051046fdb41387166b18c846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-builtins) \
python311-flake8-builtins \
python3dist(flake8-builtins)"

RDEPENDS:${PN} += "python(abi) \
python311-flake8"

inherit rpm
