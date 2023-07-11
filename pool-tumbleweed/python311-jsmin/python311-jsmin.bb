SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-jsmin-3.0.1-1.8.noarch.rpm"
RPM_HASH = "3e57894a94e2d77e9f279bd04e3b821627c6de64ac26f42dce1c888900b4225402f8addd86f2329c7c249f0c58afeb9196665306c5990ad402f3f82429a64b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsmin \
python3.11dist-jsmin \
python311-jsmin \
python3dist-jsmin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
