SUMMARY = "Call chain detection library for coredump images"
DESCRIPTION = "A C programming interface (API) to determine the call chains \
of the threads in coredump images."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunwind-coredump0-1.6.2-4.5.aarch64.rpm"
RPM_HASH = "0c5e6a89000f9f590e8c905a14fbafd20ff865b2f4d22d48a2b0179ce242d069d94c3f9089497bf50988f715b59a9df88d1b5784987199fb7a1b49a56a0077ef"

RPROVIDES:${PN} += "libunwind-coredump.so.0()(64bit) \
libunwind-coredump0 \
libunwind-coredump0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit)"

inherit rpm
