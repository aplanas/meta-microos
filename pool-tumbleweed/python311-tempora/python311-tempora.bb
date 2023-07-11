SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python311-tempora-5.2.2-1.3.noarch.rpm"
RPM_HASH = "60edf76c1cba9b4e07915b502d157812d18ce04c4d7e1dd0c5ac34a37e0681f46a61ec8b58ba22d535f91e12684f53a4f59357c26b293d1bf897d23b0bb98065"
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
