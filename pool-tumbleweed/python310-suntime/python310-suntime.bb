SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python310-suntime-1.2.5-1.14.noarch.rpm"
RPM_HASH = "58c8fd20ab8ffcc56aff1f2b4970aecc59b5581f9b644754ad5446b58f092bb790a6caf26fa1b0e71ed7bbf34f69237919ec7feeb9facca038e2341ed01a5754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suntime \
python3.10dist(suntime) \
python310-suntime \
python3dist(suntime)"

RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
