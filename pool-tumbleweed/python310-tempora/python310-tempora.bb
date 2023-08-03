SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python310-tempora-5.5.0-2.1.noarch.rpm"
RPM_HASH = "aa8e338d043b589283be3418ffb312faf9ec6f68d9c9658fbaa5cc6cce2e6eb5391753f57fea70fa09538f5255cadbfcbd4f2474fe54175eeed581e136f0e053"
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
