SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python310-tempora-5.5.0-1.1.noarch.rpm"
RPM_HASH = "bd0649850c97fdaed26b0ffa21962c56713c36233b84dc07a27445a9a4ae6f4029bc656e10a7c585781479beadde10a16e9506435a07329ec625cb7463eba36c"
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
