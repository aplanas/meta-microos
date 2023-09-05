SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-croniter-1.4.1-1.1.noarch.rpm"
RPM_HASH = "79a1f2764297d7b5e66dad4baca95e4cb306120b8f62a9858e9cd279da3e581ac80916bb0869d5700faad75d9cf002c3f1129889c5cd2f521a35b7821e031905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-croniter \
python39-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
