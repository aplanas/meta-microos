SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python39-tempora-5.2.2-1.3.noarch.rpm"
RPM_HASH = "5ae6165b39c901c44e288b417e904a11aae2fc764489a9f51a11746984dd16a721eaa404080e4fb686a94a2dc88caf73ce8e73d9490d3228e0389398434e44d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tempora \
python39-tempora \
python3dist-tempora"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-jaraco.functools \
python39-pytz"

inherit rpm
