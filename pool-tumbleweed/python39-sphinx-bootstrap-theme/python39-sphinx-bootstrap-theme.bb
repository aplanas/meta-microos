SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python39-sphinx-bootstrap-theme-0.8.1-2.2.noarch.rpm"
RPM_HASH = "9c6940142b2104d3551d24148efd3e9fc929cb13aabbe113596c04bb706ac0d6e05cfd197371077689f361c89f91435af336a0bd815c6a324e58d1fda9d37da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-bootstrap-theme) \
python39-sphinx-bootstrap-theme \
python3dist(sphinx-bootstrap-theme)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
