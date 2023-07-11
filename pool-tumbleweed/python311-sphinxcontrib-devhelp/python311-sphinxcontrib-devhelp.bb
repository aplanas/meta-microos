SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python311-sphinxcontrib-devhelp-1.0.2-2.2.noarch.rpm"
RPM_HASH = "5fba2dd6f250ff27e32b08f9e5eee35d1171944f994d68d06a79d2261ff39116fe002a18ce897c4edb5e8097ddc18bcd97036dd7253eb67d0166ed24744aaef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-devhelp \
python3.11dist-sphinxcontrib-devhelp \
python311-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
