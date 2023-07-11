SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.1.1+git7364"

RPM_NAME = "libgo22-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "09e49a59f769568249c9508fc66ccd465ca6ffc08b691cda12fc7f914c181b0b64a53b653e01ca7f1b32e222768139f83584a24fe874180c108a2776cfc39954"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
