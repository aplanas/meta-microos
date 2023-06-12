SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pingparsing-1.4.0-2.4.noarch.rpm"
RPM_HASH = "d1e046eb35dffc841bf2e0ed0baef735f77bb2e2b67ce5f58af6651d616c7344b6638541d445c0348417059257b29f0c7d3f35c5e5bebe1e3bd666959e697a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pingparsing \
python3.10dist(pingparsing) \
python310-pingparsing \
python3dist(pingparsing)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
