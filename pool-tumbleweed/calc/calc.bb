SUMMARY = "C-style arbitrary precision calculator"
DESCRIPTION = "Calc is arbitrary precision C-like arithmetic system that is a \
calculator, an algorithm prototype and mathematical research tool. \
Calc comes with a rich set of builtin mathematical and programmatic \
functions."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.6"

RPM_NAME = "calc-2.14.1.6-1.1.aarch64.rpm"
RPM_HASH = "313ee6503f98934277bd59f5773c1d5f12de578e11549d323aa9d7483f1b683c8941a93ef01a49684459ce6f907f6ad55b7c8d0ca322ba3f4490ceabf1e28061"

RPROVIDES:${PN} += "calc \
calc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
less \
libc.so.6()(64bit) \
libcalc.so.2.14.1.6()(64bit) \
libcalc2_14_1_6 \
libhistory.so.8()(64bit)"

inherit rpm
