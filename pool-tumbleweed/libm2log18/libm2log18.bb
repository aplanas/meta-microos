SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2log18-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "7c031d92db761a1e0acb495966a9a579b10f7dd07f268cbf55dbb71c5d4726550d82bb011d9ed02133c2bc37c05d96d78354eb51b5bd25bd93d872af7185cefb"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
