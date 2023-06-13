SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python311-cron-descriptor-1.2.32-1.3.noarch.rpm"
RPM_HASH = "b9ae5df6f1ae5559ebc08a36554b2d63025841ca40666a68aa1c22ee3ed18d162c6645caa21a305783c95f60baca7382c0a9fb0f0c9ca7d7f6403254810f7665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cron-descriptor) \
python311-cron-descriptor \
python3dist(cron-descriptor)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
