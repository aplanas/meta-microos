SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. \
 \
This library is not meant as a public API for application developers. \
It is only used by other netfilter.org projects, such as \
libnetfilter_log, libnetfilter_queue or libnetfilter_conntrack."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink-devel-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "346ab26624848e3fdfd5aa2c08028b8539d3739c253ab5016285b9dc0b21445747f129b7ead93a7dd2fdcba8560ac1b211c00bcbe334ead224233c6df260776f"

RPROVIDES:${PN} += "libnfnetlink-devel \
libnfnetlink-devel(aarch-64) \
pkgconfig(libnfnetlink)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfnetlink0"

inherit rpm
