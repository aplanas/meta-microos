SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-croniter-1.4.1-1.1.noarch.rpm"
RPM_HASH = "46ec52f3c287c09ec64dfc861b02f8e0f26ee2982e949490efd55c3b1e4643be6da6cd5e7be87af2f62688c66a33ba87829d10b5ee82ee81ce3df2419b6d4dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-croniter \
python3.11dist-croniter \
python311-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
