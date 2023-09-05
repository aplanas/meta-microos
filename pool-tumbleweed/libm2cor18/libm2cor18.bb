SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2cor18-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "c3d7cfe43e31f1c15fe047ae90f2e8939f38326d9b9369938d4893d125ab615a06c1ada81c28aef8d7e7a3c7f4e441d24e1a437f2dd028e518dbbc00731ad610"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
