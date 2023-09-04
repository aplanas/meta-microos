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

RPM_NAME = "selinux-tools-3.5-4.1.aarch64.rpm"
RPM_HASH = "34fa4faf76386d947a622147d600ac054ebab2f9cb08caf9e593823bef8baf96b822a945b0da4b9aa4c3b9f3e03e05b5c7226f57b3809b078690db6363bdeda7"

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
