SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-first-2.0.2-4.3.noarch.rpm"
RPM_HASH = "ae0ea611688943126d80189d14bad32f6da08121066780f5b507f377b686b53e90fa9cf2555bae7f60d4a8ab4fa10f2cead62921c93ab424c107e8e9810b943f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(first) \
python311-first \
python3dist(first)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
