SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2iso18-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "6699ffe7a93e91c735793527e2ab66d8bb85d4d5f15b433cd67d871cb1d686142cfb285ac26c767fa340c77eff3dc430fdc921d6b47b8d579e950da3ef33e897"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
