SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-confpy-0.11.0-1.12.noarch.rpm"
RPM_HASH = "3e422f5aedb0d7a975b60c910ed77a274bdfd1f55c622222a70752e79f907a8f99a3497b66a151aaccb6f12f4b67b5ea312e00d43c27d585e7869da99374d405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confpy \
python3.10dist-confpy \
python310-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
