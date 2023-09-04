SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-cron-descriptor-1.4-1.1.noarch.rpm"
RPM_HASH = "f838f9b0f003c967e5157c3145c3e988190ca148db6a3251db912692eb9de64d9b84235612edf4ed229aaeffe1124ff9d8582183a389d56c59a2778c71dfc68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cron-descriptor \
python310-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
