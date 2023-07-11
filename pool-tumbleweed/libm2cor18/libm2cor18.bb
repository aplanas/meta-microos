SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2cor18-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "0dc109716a3affee188deb1daeb983bea9145e7ee1d110f260f220608cdca8cafe389eafa922922b722cfe24aa12298172ea0aecf4c77729b6ddffd19250b604"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
