SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2pim18-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "8e6f045d56a9006ae990f9312d20828e162c52cf61bef9353f4435a098fec7c337474afab8bd9c29ae36e4f2b0161b0553e697cf34d8da19fc8ab184f3c099ca"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
