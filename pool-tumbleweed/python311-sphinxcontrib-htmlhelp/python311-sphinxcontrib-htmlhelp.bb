SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.4"

RPM_NAME = "python311-sphinxcontrib-htmlhelp-2.0.4-1.1.noarch.rpm"
RPM_HASH = "9008edd816ead74c32aaba1714eb8a5efed1185c902a0c78906bef8b3f757a834d6c09204985a8899663c9f3e22c9b6af967d41f70df71e3febda4a6ab0b10b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-htmlhelp \
python3.11dist-sphinxcontrib-htmlhelp \
python311-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
