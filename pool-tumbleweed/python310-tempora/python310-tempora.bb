SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python310-tempora-5.2.2-1.1.noarch.rpm"
RPM_HASH = "c5c230996c5ba74fec68cb9b8d533ce04f8963dc369f99184a17403222a28817e9ac81fc814282f164ad37a381a236e73aa982600cedbf8583989a516e283948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tempora \
python3.10dist(tempora) \
python310-tempora \
python3dist(tempora)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-jaraco.functools \
python310-pytz"

inherit rpm
