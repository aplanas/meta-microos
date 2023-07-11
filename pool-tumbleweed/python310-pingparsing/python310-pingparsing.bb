SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pingparsing-1.4.0-2.6.noarch.rpm"
RPM_HASH = "b22d3b93edb521b02d636951008a1ce71e1a8799d2fe8d4fa02ad92ef0f2ab05d132e0a697fbb5ed40998595091343193f53309ae9df650f45ed373cbd4e4e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pingparsing \
python310-pingparsing \
python3dist-pingparsing"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-humanreadable \
python310-loguru \
python310-pyparsing \
python310-pytz \
python310-setuptools \
python310-simplejson \
python310-subprocrunner \
python310-typepy \
update-alternatives"

inherit rpm
