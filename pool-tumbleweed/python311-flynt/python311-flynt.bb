SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python311-flynt-0.76-1.8.noarch.rpm"
RPM_HASH = "b51cf493895c9fd894276236ec3372b18d7ef9a0cfdb52e10f137d71d4a8e6a02947dd1bee15497caf9cd44614a325f0c627436ef03350a54cdb79dce0f62089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flynt \
python311-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-astor \
python311-tomli"

inherit rpm
