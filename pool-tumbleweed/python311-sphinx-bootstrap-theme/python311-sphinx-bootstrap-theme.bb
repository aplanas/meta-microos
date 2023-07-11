SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python311-sphinx-bootstrap-theme-0.8.1-2.3.noarch.rpm"
RPM_HASH = "53c6594bdbdfa3cf114175721661e9a7fddb0e603f0537e5a2ba86939b79c644efa4262288f8140ddffa6d0c574875bc62d93d2c887b409c80c04ff4e1bc2fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-bootstrap-theme \
python3.11dist-sphinx-bootstrap-theme \
python311-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
