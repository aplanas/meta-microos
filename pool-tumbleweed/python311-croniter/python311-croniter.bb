SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python311-croniter-1.3.15-2.1.noarch.rpm"
RPM_HASH = "c36b06c9ac369cdd3eb6353947b3cfe07a842f4f37b9b551ce36a4166a4507bdfcbd5e0bbb697578ca50cf241e42a24e50a5509f16e22e979302dfd0fa7f7df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-croniter \
python3.11dist-croniter \
python311-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
