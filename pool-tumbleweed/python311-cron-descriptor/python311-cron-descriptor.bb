SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-cron-descriptor-1.4-1.1.noarch.rpm"
RPM_HASH = "6ede66ee8b21a58a9619f82c9e96d79246d2ed04dde6c65e39b61ea9815b8a808b965735299252ccff86b5a3f62ff5071b3edb3bb15f99779bcae7e273f49f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cron-descriptor \
python3.11dist-cron-descriptor \
python311-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
