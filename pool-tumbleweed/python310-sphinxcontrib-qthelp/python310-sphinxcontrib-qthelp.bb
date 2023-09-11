SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "python310-sphinxcontrib-qthelp-1.0.6-1.1.noarch.rpm"
RPM_HASH = "8a69c576adaf8c5508b77a60a4b192bcb0bd5a59725cc278a589893e4c9ee7c63abd2eb1d10b14435618a3eb5ac0f8580a964730269640c1f43394a19cc20c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-qthelp \
python310-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
