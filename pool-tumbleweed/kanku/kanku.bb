SUMMARY = "Development and continuous integration"
DESCRIPTION = "kanku is a utility for integration of kiwi images built \
by the Open Build Service (OBS) in a development and testing workflow. \
 \
It provides a framework for automation of setups, \
e.g. to prepare development environments or run simple tests."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-0.14.0-1.3.noarch.rpm"
RPM_HASH = "85c678c3418f55d7138acb1431854448d998c41925f25e899a0b8235a8b21b83eeaf8531912d093bc603a7ffa6e84a3979ff18694ab9e925b8e2268372e4b420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku"
RDEPENDS:${PN} += "kanku-cli \
kanku-dispatcher \
kanku-scheduler \
kanku-triggerd \
kanku-web \
kanku-worker"

inherit rpm
