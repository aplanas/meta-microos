SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python311-setuptools-version-command-99.9-1.3.noarch.rpm"
RPM_HASH = "a049b3f2c75276925ce5f2c7d6d79e7f7b9a267e03aba878e566e7c4a2d6d5aef427712c12b616b3a1740cfb1c1a8a882ecfeb07fde5af734ff42982b847cb30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-version-command) \
python311-setuptools-version-command \
python3dist(setuptools-version-command)"

RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
