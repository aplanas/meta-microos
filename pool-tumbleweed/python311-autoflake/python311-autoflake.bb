SUMMARY = "Program to removes unused Python imports and variables"
DESCRIPTION = "Autoflake removes unused imports and unused variables from Python \
code. It makes use of pyflakes to do this. \
 \
By default, autoflake only removes unused imports for modules that \
are part of the standard library. (Other modules may have side \
effects that make them unsafe to remove automatically.) Removal of \
unused variables is also disabled by default. \
 \
autoflake also removes useless pass statements."
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "python311-autoflake-1.5.3-2.1.noarch.rpm"
RPM_HASH = "572bd0b5a889a528733670806daa6ebcb91701d89dd36fa1586f0d7143fa24b70c28309a5a7f8073b56baccaeb3410adea9bfb2a510140023e122ed72ceb3ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoflake \
python3.11dist-autoflake \
python311-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyflakes \
python311-toml \
update-alternatives"

inherit rpm
