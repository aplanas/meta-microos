SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python310-sphinxcontrib-devhelp-1.0.2-2.2.noarch.rpm"
RPM_HASH = "426ef8a04852625895fb918a632fa18f4b9bca45854eb1a94b61b26fa1f8ffb2ce7ee854da324b7f2b4165a1e6421a99b7b221a0ee0c3ec8d1e3fe3251c63eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-devhelp \
python310-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
