SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libgdruntime4-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "e1a8a20249de71c51458b141886391699a067827b8f871e7d40228d92b1d8a8d35e757cdb3b8531cb54c25dc2cb98e3269ded77945aea8ac6c7f7d05ae797fdc"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
