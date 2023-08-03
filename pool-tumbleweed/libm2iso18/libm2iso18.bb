SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libm2iso18-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "a6dc0eafa1400488d1215e78dcff57b410c071605d189d03902d628675eca863b41083480eb672b78d505d561d5084965471a26f7ef54b451c7c21ae44444bb9"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
