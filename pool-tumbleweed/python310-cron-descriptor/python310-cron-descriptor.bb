SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python310-cron-descriptor-1.2.32-1.5.noarch.rpm"
RPM_HASH = "9bd02a7989dd037e7153734f44fc06ff1a38e59ac5b1ef95b59d85c8444af7796b4bbf95715847ff948efbbcde2ea362c3ce7affab88c52565609b1f424691e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cron-descriptor \
python310-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
