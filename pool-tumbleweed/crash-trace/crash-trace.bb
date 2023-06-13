SUMMARY = "The trace command for crash"
DESCRIPTION = "This extension implements the 'trace' command for the crash tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "crash-trace-3.0-2.2.aarch64.rpm"
RPM_HASH = "7fa85efcad1ba2cbc33942c74880c5732fcbd771b1bf487500e78907eb7133313887e8b481f54dbf33ef3a7e4eb1a1673e16b4de71cbb5599966f00fdde1680c"

RPROVIDES:${PN} += "crash-trace \
crash-trace(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
trace-cmd"

inherit rpm
