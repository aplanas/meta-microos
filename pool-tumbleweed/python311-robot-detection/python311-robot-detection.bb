SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python311-robot-detection-0.4.0-2.8.noarch.rpm"
RPM_HASH = "07b4dfee367c1e20ce9ae8baa7e7e957fe05faa0a71e7106f6a92f394107dc343e2d7bac5e0a811343e207f93d3382ac8bdd357562a01292a8c3cc244818b994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(robot-detection) \
python311-robot-detection \
python3dist(robot-detection)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
