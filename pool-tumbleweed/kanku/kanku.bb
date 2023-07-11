SUMMARY = "Development and continuous integration"
DESCRIPTION = "kanku is a utility for integration of kiwi images built \
by the Open Build Service (OBS) in a development and testing workflow. \
 \
It provides a framework for automation of setups, \
e.g. to prepare development environments or run simple tests."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-0.14.0-1.5.noarch.rpm"
RPM_HASH = "2c974907be61eb40c24a1e2ccfe48a964b73b2578693b65e1e7c9c43808e28d2a2da8f2c63c7d78b20701b5c13b69fe49d40eb2dce9cfab07554d24014a19f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku"

RDEPENDS:${PN} += "kanku-cli \
kanku-dispatcher \
kanku-scheduler \
kanku-triggerd \
kanku-web \
kanku-worker"

inherit rpm
