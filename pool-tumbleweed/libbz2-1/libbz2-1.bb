SUMMARY = "The bzip2 runtime library"
DESCRIPTION = "The bzip2 runtime library"
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-1-1.0.8-5.5.aarch64.rpm"
RPM_HASH = "7dcb2722d0f781a54b8268f579d089f4f7633129d0dc19fbe49bd3ca80cbe852533f164bed8bcff3f8126888fc1faad7f16c56b44f2ae0940350adc93ddbbf19"

RPROVIDES:${PN} += "libbz2-1 \
libbz2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
