SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-PyRect-0.2.0-1.5.noarch.rpm"
RPM_HASH = "47f21a4105f5e31e828ca4f1ee0f729233d247c5cc7768674e95000d923490cdbbcd28ffac46e952892bb33290aec7cb08322ca5f88f765f7267fe6808fca24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyrect \
python310-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
