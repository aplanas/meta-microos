SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python311-cron-descriptor-1.2.32-1.5.noarch.rpm"
RPM_HASH = "37f67b4678fdbbc0c7f6e4956380d479ddb072788e29e274d09d5bbc1116f12c8cfae41de82bb48bd69576fcf41f13758abeee1e708982df81c45c5a763e9219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cron-descriptor \
python3.11dist-cron-descriptor \
python311-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
