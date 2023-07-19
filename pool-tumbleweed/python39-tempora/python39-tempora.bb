SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python39-tempora-5.5.0-1.1.noarch.rpm"
RPM_HASH = "1c89d291ce27202024dbf00791f8cd542c5d5d52c690b633480bd4db95fa5a4f331531766816498eb5e7d9498c95b851b931040782cdf51410f99632b9b0ae11"
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
