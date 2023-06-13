SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python311-pycairo-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "75b76244abcaa59573763e6c602144b1ed42be1b397e1f20ea0a22cce884375fa37193592aeacba53f1e660340f5745839d10bcd82b2b8ebfa42609e6c6db848"

RPROVIDES:${PN} += "python3.11dist(pycairo) \
python311-cairo \
python311-pycairo \
python311-pycairo(aarch-64) \
python3dist(pycairo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
python(abi)"

inherit rpm
