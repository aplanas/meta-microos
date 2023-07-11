SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python311-ruamel.base-1.0.0+post1-2.15.noarch.rpm"
RPM_HASH = "6e2c1572063daa7953e503dc33ecd3a706629832761629745efce71a93d4d62a58b5d406cee18c3a6a4947f60f6eb8610f80ffbb520d35436c9dd653ef2b2f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.base \
python3.11dist-ruamel.base \
python311-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
