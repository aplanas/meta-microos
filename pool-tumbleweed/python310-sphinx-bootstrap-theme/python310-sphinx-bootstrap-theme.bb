SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python310-sphinx-bootstrap-theme-0.8.1-2.3.noarch.rpm"
RPM_HASH = "87d7ffb0ecec027618710fcb4aefcf49d99a778d51f4a68bcb776b1813a18b584112e085bdd58e1bda80ea42d965b9f91d6c3ae12c577579d8baff8c3781e9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-bootstrap-theme \
python310-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
