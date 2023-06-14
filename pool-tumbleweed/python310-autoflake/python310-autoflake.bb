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

RPM_NAME = "python310-autoflake-1.5.3-1.4.noarch.rpm"
RPM_HASH = "e9b05920b3f7f5213cfde3e0376c22c7a547618295a5bc6dc6c7faed957b2442052264202d3d365b84aceb2969e0bb00918d8c942fd3c42fdc1a761557c3c1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoflake \
python3.10dist-autoflake \
python310-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-pyflakes \
python310-toml \
update-alternatives"

inherit rpm
