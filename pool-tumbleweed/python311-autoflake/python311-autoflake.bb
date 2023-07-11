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

RPM_NAME = "python311-autoflake-1.5.3-1.6.noarch.rpm"
RPM_HASH = "09d6d4a10a8f786a5ec80119749fef83053e67f39e9619a1f240d2f4958d54cc1ab114accc89679a855c3fb4902085d23ed20674ecc030fdbc18061703714782"
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
