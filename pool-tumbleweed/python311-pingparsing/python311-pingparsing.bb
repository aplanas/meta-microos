SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-pingparsing-1.4.0-2.6.noarch.rpm"
RPM_HASH = "86e320763402a4d8a7dacaa522113e031c9c41ec90803b9bdf0420f4a83fe3e11a44ae0e45440410ceeca517de23ac981348cc9c422755e21ceb7b1df82f953c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pingparsing \
python3.11dist-pingparsing \
python311-pingparsing \
python3dist-pingparsing"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-humanreadable \
python311-loguru \
python311-pyparsing \
python311-pytz \
python311-setuptools \
python311-simplejson \
python311-subprocrunner \
python311-typepy \
update-alternatives"

inherit rpm
