SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-croniter-1.4.1-1.1.noarch.rpm"
RPM_HASH = "11cc6c800f800d45fc17b0e1c6f76ea0552772488fb20d6e6c15cf613675f2cc5bef1d0fecfc75c5daefee3d5987654125d5ff5a4917b256d25ba59a6b7b6ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-croniter \
python310-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
