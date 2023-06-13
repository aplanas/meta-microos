SUMMARY = "Trace the syscall activity on the system"
DESCRIPTION = "Process Monitor (Procmon) is a Linux reimagining of the classic Procmon \
tool from the Sysinternals suite of tools for Windows. Procmon provides \
a convenient and efficient way for Linux developers to trace the syscall \
activity on the system."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "procmon-1.0.1-4.1.aarch64.rpm"
RPM_HASH = "b279940adaf625368aa7e0470f2b4c646080549614816ae29d95ec7ebc9d3974b47845594477f685fe35933fbe4e9cfb0bf156d305607ec48f849a2798b920ec"

RPROVIDES:${PN} += "procmon \
procmon(aarch-64)"

RDEPENDS:${PN} += "kernel-devel \
ld-linux-aarch64.so.1()(64bit) \
libbcc.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncurses.so.6()(64bit) \
libpanel.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
