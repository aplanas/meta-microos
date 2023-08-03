SUMMARY = "C-style arbitrary precision calculator"
DESCRIPTION = "Calc is arbitrary precision C-like arithmetic system that is a \
calculator, an algorithm prototype and mathematical research tool. \
Calc comes with a rich set of builtin mathematical and programmatic \
functions."
LICENSE = "LGPL-2.1-only"

PV = "2.14.2.2"

RPM_NAME = "calc-2.14.2.2-1.1.aarch64.rpm"
RPM_HASH = "66a100de062723a4b66aab23dd00b94d92fe724c53afcf74a13e1286a78565594f564e9e51260e6fe4e2489eb6df20b943166e6cfb232d1bdeda0a81d6ca37cb"

RPROVIDES:${PN} += "calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libcalc.so.2.14.2.2 \
libcalc2-14-2-2 \
libhistory.so.8"

inherit rpm
