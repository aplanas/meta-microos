SUMMARY = "SELinux command-line utilities"
DESCRIPTION = "Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security. \
 \
This subpackage contains utilities to inspect and administer the \
system's SELinux state."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "selinux-tools-3.5-2.1.aarch64.rpm"
RPM_HASH = "725977a0f87271a80cc84e47288d577f804d664e9783b38dfb7c855cb9d4f8f5e0e5fc29bae375aa72d0af567b66f105ee3d0ff2b1482c7adfe0b724114c413a"

RPROVIDES:${PN} += "libselinux-utils \
selinux-tools \
selinux-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcre2-8.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libselinux.so.1(LIBSELINUX_3.5)(64bit) \
libselinux1 \
libsepol.so.2()(64bit) \
libsepol.so.2(LIBSEPOL_1.0)(64bit)"

inherit rpm