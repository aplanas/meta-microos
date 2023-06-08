SUMMARY = "C-style arbitrary precision calculator"
DESCRIPTION = "Calc is arbitrary precision C-like arithmetic system that is a \
calculator, an algorithm prototype and mathematical research tool. \
Calc comes with a rich set of builtin mathematical and programmatic \
functions."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.5"

RPM_NAME = "calc-2.14.1.5-1.3.aarch64.rpm"
RPM_HASH = "fa280666adfe0e8ffc31b05cb6646eec2cc898d4eba332d0cbe226f4376d9df9e4ece30cff722e1f3de327248ebdd5188c25cb5271ff71104f35b2f8addffca7"

RPROVIDES:${PN} += "calc calc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) less libc.so.6(GLIBC_2.34)(64bit) libcalc.so.2.14.1.5()(64bit) libcalc2_14_1_5 libhistory.so.8()(64bit)"

inherit rpm
