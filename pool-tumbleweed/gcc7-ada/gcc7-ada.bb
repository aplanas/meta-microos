SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-ada-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "5f8d10171be2560e044cdd1f943fe8e8fe5d805426882631031619a1674bccb581d94423df57803f0191f6c7a7e383ee6b8e49d8272f915f812f999aee436512"

RPROVIDES:${PN} += "gcc7-ada"

RDEPENDS:${PN} += "gcc7 \
libada7 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
