SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2min18-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "605f6565cbc968536894f74389029c77de94be922693db99dd0a8c5665952a6940a2c8199585046045fb6f45c49a2d0203aae9242950c8dcc1613e510225cecd"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
