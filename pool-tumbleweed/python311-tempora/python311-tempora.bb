SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python311-tempora-5.5.0-2.1.noarch.rpm"
RPM_HASH = "e6714cc13f9eb174a87fcd5c99915cf97bcb8d8a01384e502560990206dd06be6712ab94a166ffda3a17d5b83016b271e08a4136d91718b4a10cda1e74c78a22"
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
