SUMMARY = "Library to parse sysconfig setting files"
DESCRIPTION = "This library can be used to parse setting files that follow a trivial \
'KEY=VALUE'-style pattern, similar to what can be found in files \
located in /etc/sysconfig. libdeflt supports values with spaces \
which are not quoted, and which therefore are not always compatible \
with sh."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libdeflt1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "d7361594f2697c9bad1c2b39ecf432a466be219ecff232dce6655cf43fa9e59adde0b3bd2fd7a5d31fb4da739056507f8fbebf43513b52cd872ae6300bc2a791"

RPROVIDES:${PN} += "libdeflt.so.1.0 \
libdeflt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
