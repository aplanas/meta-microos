SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-pingparsing-1.4.0-2.6.noarch.rpm"
RPM_HASH = "40a05e75483ef91fcbd43d314ab7079fa81416703220a4fe11f00a6cfadb029a0ddbb959084fa5265260da934e8fa6c6dad9c7496e2be49bc04f359d9cd29e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pingparsing \
python39-pingparsing \
python3dist-pingparsing"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-humanreadable \
python39-loguru \
python39-pyparsing \
python39-pytz \
python39-setuptools \
python39-simplejson \
python39-subprocrunner \
python39-typepy \
update-alternatives"

inherit rpm
