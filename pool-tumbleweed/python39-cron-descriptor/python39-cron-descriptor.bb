SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-cron-descriptor-1.4-1.1.noarch.rpm"
RPM_HASH = "5b5ae8eabf952ed0b803e0f359ece58cf0742fb58e40d6c1937959b0e5113c661ffddeb4d2b8187b6e4e2a51239d430c88899f0522fc733f2fc0068af306a38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cron-descriptor \
python39-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
