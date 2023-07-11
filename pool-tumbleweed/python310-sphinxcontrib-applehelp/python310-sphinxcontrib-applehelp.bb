SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python310-sphinxcontrib-applehelp-1.0.4-2.3.noarch.rpm"
RPM_HASH = "33d0467270d11cbe5377a600ff082f49f17f53f6b7a40f5c0a82d747e3d15b10a38783c9e876c191aad827a6d01d47b1b8d72ea3557e5ca1d7525479b0e7d402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-applehelp \
python310-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
