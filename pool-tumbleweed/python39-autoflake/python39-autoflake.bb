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

RPM_NAME = "python39-autoflake-1.5.3-1.6.noarch.rpm"
RPM_HASH = "7efd399c0283c300910925dfc9f08eccbfb27e6f7e5f7866cdc0b2c5d5df4ee26d9c95ac315c2fb48d8d20aed65769d0d2a63a21bf97c8e9ba599d53dee0ce0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autoflake \
python39-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyflakes \
python39-toml \
update-alternatives"

inherit rpm
