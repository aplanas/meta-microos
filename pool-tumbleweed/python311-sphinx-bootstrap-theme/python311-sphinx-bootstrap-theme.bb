SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python311-sphinx-bootstrap-theme-0.8.1-2.2.noarch.rpm"
RPM_HASH = "302e79f162eb4aec76115b3afdf7840ce9000e60f266b9c20c3f95b44c722622158cdafbda2f10f4ea4e1caeb7be1ec1ef087f8ceaa25f3be342c21f882b1a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-bootstrap-theme \
python311-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
