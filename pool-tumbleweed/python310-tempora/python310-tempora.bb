SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python310-tempora-5.2.2-1.3.noarch.rpm"
RPM_HASH = "231fc04e60ea758b75f749ee72adaba599f6da8bbe085ea3590a0c4b0014d76a558d4676223ad3c9ef4f2282942a2960ddca4b341f74db95b50b9e06d70c2d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tempora \
python310-tempora \
python3dist-tempora"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-jaraco.functools \
python310-pytz"

inherit rpm
