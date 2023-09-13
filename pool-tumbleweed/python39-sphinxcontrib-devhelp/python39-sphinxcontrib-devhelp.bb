SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python39-sphinxcontrib-devhelp-1.0.5-1.1.noarch.rpm"
RPM_HASH = "a24ce438ecf2f9f0e1ce92fbe282463bef3745db9709626996ff2bddd3e262d4a7b749b87d103933100e491bd63d679a267f376af459b855152b7cfae8dafdc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-devhelp \
python39-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
