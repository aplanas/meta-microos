SUMMARY = "Trace the syscall activity on the system"
DESCRIPTION = "Process Monitor (Procmon) is a Linux reimagining of the classic Procmon \
tool from the Sysinternals suite of tools for Windows. Procmon provides \
a convenient and efficient way for Linux developers to trace the syscall \
activity on the system."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "procmon-1.0.1-4.2.aarch64.rpm"
RPM_HASH = "f548d71b23083ec85ac7a9913661101c905d14e8b3230ce404c54305736ad4a7c7f00c195a5d4069ebb8086f8824e05c5c5333ec04e727443299994dae86e77e"

RPROVIDES:${PN} += "procmon"

RDEPENDS:${PN} += "kernel-devel \
ld-linux-aarch64.so.1 \
libbcc.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpanel.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
