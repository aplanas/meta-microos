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

RPM_NAME = "selinux-tools-3.5-3.2.aarch64.rpm"
RPM_HASH = "05e3cf7dbc71e686d28436cf902b695015806798fddf60078f635530e9f942151d5fa1421f644e07ec7d512edf726f2305e271719c0dcf2631f55dd7d36f07ea"

RPROVIDES:${PN} += "libselinux-utils \
selinux-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libselinux1 \
libsepol.so.2"

inherit rpm
