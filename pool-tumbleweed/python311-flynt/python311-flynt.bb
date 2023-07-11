SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python311-flynt-0.76-1.10.noarch.rpm"
RPM_HASH = "9fe7b861349d1d25585342d071689530107ccb1090c90dc98987b00881ad073f999121ee6991529ed748a5357c9b750efe8461a41b3409e402da2d18e144c03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flynt \
python3.11dist-flynt \
python311-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astor \
python311-tomli"

inherit rpm
