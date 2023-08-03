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

RPM_NAME = "python310-autoflake-1.5.3-2.1.noarch.rpm"
RPM_HASH = "459d7abfb9a015a0e3d78ecfe1d10e7e445e6ffd79d404939354490703a1f4293e3ecd1f0fe6d849c75915396b128dda562920415a35c4910f0b78ad610f251c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autoflake \
python310-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyflakes \
python310-toml \
update-alternatives"

inherit rpm
