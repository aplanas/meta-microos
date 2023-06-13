SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python311-infinity-1.5-2.3.noarch.rpm"
RPM_HASH = "c82068793a54ef2507884ec02f1b31e91a123f77e2e5c223a46b7fa881271f00869b63a71d86a3b25b1fe5d43409578b72210bef38c0e040d7549f19c93f9208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(infinity) \
python311-infinity \
python3dist(infinity)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
