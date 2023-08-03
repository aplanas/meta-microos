SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python39-tempora-5.5.0-2.1.noarch.rpm"
RPM_HASH = "70715b6a12835faeebb19857ccba6385c49462ab74507dbc2d109429797e7d8c59773238441687542d9bc88f199ed7634a034cbf773b48ef5f29476fea25ffc0"
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
