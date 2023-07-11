SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. \
 \
This library is not meant as a public API for application developers. \
It is only used by other netfilter.org projects, such as \
libnetfilter_log, libnetfilter_queue or libnetfilter_conntrack."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink-devel-1.0.2-1.8.aarch64.rpm"
RPM_HASH = "fb8080700d0a245d772ecb1fefc4701574329f18be9a03bd0b7d2c383e4c47311e0d9848f8f78429e3f8bc718a3af36337790529dc45fea523ff06c467b281b7"

RPROVIDES:${PN} += "libnfnetlink-devel \
pkgconfig-libnfnetlink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfnetlink0"

inherit rpm
