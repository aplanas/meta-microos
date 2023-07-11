SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python39-dash-renderer-1.9.1-1.11.noarch.rpm"
RPM_HASH = "7a2224cd599e9b652b4affe30a81f8775034b31dbd92fe4f38976e8b2d104648339564b73c1752b3fb9d45370380e6052dd817510494396723e4ad72317498d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dash-renderer \
python39-dash-renderer \
python3dist-dash-renderer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
