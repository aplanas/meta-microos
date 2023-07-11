SUMMARY = "Non-local goto (setjmp/longmap) implementation based on libunwind"
DESCRIPTION = "The unwind-setjmp library offers a libunwind-based implementation of \
non-local gotos. This is a drop-in replacement for the normal, \
system-provided routines of the same name. With this library, setting \
up a non-local goto via setjmp is generally faster compared to the \
system routines, at the cost of a much slower longjmp."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libunwind-setjmp0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "22c3ed40210ecd33df83a1bf176f067682b79faaf430864271054ac61663b25ec9980e66a2188d38bf502b9ef2caed2cbd71d8be3825e706341243947e93ac43"

RPROVIDES:${PN} += "libunwind-setjmp.so.0 \
libunwind-setjmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libunwind-aarch64.so.8"

inherit rpm
