SUMMARY = "Disk Quota System"
DESCRIPTION = "The quota subsystem allows a system administrator to set soft and hard \
limits on used space and the number of inodes used for users and \
groups. The kernel must be compiled with disk quota support enabled \
(SUSE kernels have this support)."
LICENSE = "GPL-2.0-only"

PV = "4.09"

RPM_NAME = "quota-4.09-2.4.aarch64.rpm"
RPM_HASH = "16d36512ab0f3bec7ff60f81ba26c8d90871480d38614b4b9835e4217ce4c1068c6945860094f059c010f580228c1307bbde16ac6192a5aebedd62d5c1466870"

RPROVIDES:${PN} += "config-quota \
quota"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libext2fs.so.2 \
liblber.so.2 \
libldap.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtirpc.so.3"

inherit rpm
