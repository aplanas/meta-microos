SUMMARY = "LibRCC Runtime Environment"
DESCRIPTION = "Runtime environment for the LibRCC package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "rcc-runtime-0.2.13-1.3.aarch64.rpm"
RPM_HASH = "72638c3ef0524cff42134e175cf7d4763b7cb522fbb50cde22cd2cc36e68228d94d60af3a3942c51550e0b1b00961417398188fd82fd167d8573c3c78047dddf"

RPROVIDES:${PN} += "config(rcc-runtime) \
libguess_engine.so()(64bit) \
librcd_engine.so()(64bit) \
rcc-runtime \
rcc-runtime(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libguess.so.1()(64bit) \
librcc.so.0()(64bit) \
librcd.so.0()(64bit)"

inherit rpm
