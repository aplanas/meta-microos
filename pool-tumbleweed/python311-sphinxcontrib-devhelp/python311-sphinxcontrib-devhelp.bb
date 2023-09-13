SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python311-sphinxcontrib-devhelp-1.0.5-1.1.noarch.rpm"
RPM_HASH = "026930542ee4460df09ff4fd2d9a8312faa96b4a2b25a45debd49354a6fca816a0cb6e1f4dafae5824fa9b7fb605290dae8016833e3030da3a2d21bedc57d6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-devhelp \
python3.11dist-sphinxcontrib-devhelp \
python311-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
