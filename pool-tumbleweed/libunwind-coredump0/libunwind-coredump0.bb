SUMMARY = "Call chain detection library for coredump images"
DESCRIPTION = "A C programming interface (API) to determine the call chains \
of the threads in coredump images."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libunwind-coredump0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "8e3722002c9b8c540361d7efc320122740ec0ef98eeabdacbe3ca9367d20fd6129cc7e3e99f515eb73c8c3c5fd711ab028af570d6784fa0e32e1c882559b621e"

RPROVIDES:${PN} += "libunwind-coredump.so.0 \
libunwind-coredump0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
