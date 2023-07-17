SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libm2cor18-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "dd6b4dda3fd2c322d2c70e0e20a1577cf2b151b987b5085b57768376208b53f5acadb0cc4179a56f3e6b2c112210539d9576c3ff968b6c9d965afa2ae51ea48f"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
