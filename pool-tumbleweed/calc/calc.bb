SUMMARY = "C-style arbitrary precision calculator"
DESCRIPTION = "Calc is arbitrary precision C-like arithmetic system that is a \
calculator, an algorithm prototype and mathematical research tool. \
Calc comes with a rich set of builtin mathematical and programmatic \
functions."
LICENSE = "LGPL-2.1-only"

PV = "2.14.3.4"

RPM_NAME = "calc-2.14.3.4-1.1.aarch64.rpm"
RPM_HASH = "0e8bdfd7b2cc7cd8cbe7601156d3cca7439d58a1a18a850f529559554bf10490a059f2e4a163fa4484f268ca85ab36fa4746389d88775e2081e617211bd41926"

RPROVIDES:${PN} += "calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libcalc.so.2.14.3.4 \
libcalc2-14-3-4 \
libcustcalc.so.2.14.3.4 \
libhistory.so.8"

inherit rpm
