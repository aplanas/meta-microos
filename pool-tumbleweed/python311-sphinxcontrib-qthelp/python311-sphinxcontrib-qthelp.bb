SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "python311-sphinxcontrib-qthelp-1.0.6-1.1.noarch.rpm"
RPM_HASH = "4c4025e3dcfad1f3648838434f0b15a5346070b3f3a94b134e40532127a324e443a991015b64ea8774965504044a75c64d60acffb1689aae5acadb132386bab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-qthelp \
python3.11dist-sphinxcontrib-qthelp \
python311-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
