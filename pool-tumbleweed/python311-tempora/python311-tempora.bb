SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python311-tempora-5.5.0-1.1.noarch.rpm"
RPM_HASH = "4988bd040e310eea4c2f1be7f3ee52ae2af3cf765bf51f0a32472d44b24fca66e24bb94e02eaf44f864ba16fbbe10af681cf1c1834e78d52061d4f3dccfa1c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tempora \
python3.11dist-tempora \
python311-tempora \
python3dist-tempora"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-jaraco.functools \
python311-pytz"

inherit rpm
