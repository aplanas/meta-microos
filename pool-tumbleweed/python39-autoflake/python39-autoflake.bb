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

RPM_NAME = "python39-autoflake-1.5.3-2.1.noarch.rpm"
RPM_HASH = "b3e3a86b2db408554a3b895b5778c6f91b8b2442999b13af8de2a8ba96ee3fa5c9c524c6781eb4ff01200c8df26bfd081ee048e4b5825ba5bd7638f44144c310"
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
