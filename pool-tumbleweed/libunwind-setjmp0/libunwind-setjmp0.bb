SUMMARY = "Non-local goto (setjmp/longmap) implementation based on libunwind"
DESCRIPTION = "The unwind-setjmp library offers a libunwind-based implementation of \
non-local gotos. This is a drop-in replacement for the normal, \
system-provided routines of the same name. With this library, setting \
up a non-local goto via setjmp is generally faster compared to the \
system routines, at the cost of a much slower longjmp."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "libunwind-setjmp0-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "51bc40a506bd776f07eeca4f4df0daa220207f60127ab63352b94c745832dc92b70f125da7695dc81222cb81cd0230c9d73c3ac95611b421861648c46c21135e"

RPROVIDES:${PN} += "libunwind-setjmp.so.0 \
libunwind-setjmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libunwind-aarch64.so.8"

inherit rpm
