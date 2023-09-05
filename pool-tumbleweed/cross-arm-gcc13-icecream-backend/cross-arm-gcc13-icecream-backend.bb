SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2c997d01ae450544d58c967570b723f2febf77a7537f09d02be49dffbea86c661cdf9efd7682657c688a024d731825d016520effce19ed3a73b6db6b87c1da65"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
