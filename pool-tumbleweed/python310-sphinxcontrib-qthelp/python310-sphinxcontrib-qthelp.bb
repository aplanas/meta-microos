SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python310-sphinxcontrib-qthelp-1.0.3-3.1.noarch.rpm"
RPM_HASH = "3ff1b3fedbbd2396449cc9fd802bf500f4db0e7961dfae81b141a8335c85f5e1becd53ade980c9d0f3b631055cff8da26f9cf2691b116fd6243200f2bce385be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-qthelp \
python3.10dist-sphinxcontrib-qthelp \
python310-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
