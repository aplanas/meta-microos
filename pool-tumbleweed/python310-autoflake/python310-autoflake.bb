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

RPM_NAME = "python310-autoflake-1.5.3-1.6.noarch.rpm"
RPM_HASH = "0a17f1ecb5197ff4954c066c77eca4b0cea36431d643efe30d1ad07d974765346e18c436737b539ea765d1c7fed46280468e0cded604e7ebbb0f3d978dade8ab"
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
