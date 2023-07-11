SUMMARY = "The system GNU Objective C Compiler"
DESCRIPTION = "The system GNU Objective C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-objc-13-1.5.aarch64.rpm"
RPM_HASH = "1dfbf94db31f2c63970550e7fac0502ec3c8dbe5cbb8ca94665def5a12adc5f03bd591240153ebd51424d5e42b8ddf1ffefc619157b44fe38fea0c1ba1a0b01b"

RPROVIDES:${PN} += "gcc-objc"

RDEPENDS:${PN} += "gcc \
gcc13-objc"

inherit rpm
