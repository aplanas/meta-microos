SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. It provides a generic messaging \
infrastructure for in-kernel netfilter subsystems (such as \
nfnetlink_log, nfnetlink_queue, nfnetlink_conntrack) and their \
respective users and/or management tools in userspace."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink0-1.0.2-1.8.aarch64.rpm"
RPM_HASH = "9a2bfe86a7d4a8f1f25622764add8363f2531f4d608eb2c4fd2dc64f5e5c925bf831b69be518225f2c7d2b181deefcde7ad9a03cd1b9f07710755c84a4bb0773"

RPROVIDES:${PN} += "libnfnetlink.so.0 \
libnfnetlink0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
