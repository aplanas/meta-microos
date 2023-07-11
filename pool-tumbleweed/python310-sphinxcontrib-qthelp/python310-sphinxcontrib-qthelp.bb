SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python310-sphinxcontrib-qthelp-1.0.3-3.2.noarch.rpm"
RPM_HASH = "5f9e93c37b37e4dec912f2b9d6972acca31f9cfc6265c0e1c3c8504e6d9ef6da655b4ee2178f235d1c287f761d58f6b5b2db8a859ab7d7b6b907258a7900809e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-qthelp \
python310-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
