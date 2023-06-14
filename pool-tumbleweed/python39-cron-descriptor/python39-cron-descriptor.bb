SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python39-cron-descriptor-1.2.32-1.3.noarch.rpm"
RPM_HASH = "322f6b152d49402348ea0fd1d9668ab30734a4d9b046dd66841973f0b5cbd59a0008764cf78d6d46d07834581635db011b384938a5a4c081492a54aa0d1fcd14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cron-descriptor \
python39-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
