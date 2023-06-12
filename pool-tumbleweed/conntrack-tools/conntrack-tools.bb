SUMMARY = "Userspace tools for interacting with the Connection Tracking System"
DESCRIPTION = "The conntrack/nfct utilities provide the userspace interface to the \
Netfilter connection tracking, replacing \
/proc/net/ip_conntrack. The tools can be used to search, list, \
inspect and maintain the connection tracking subsystem of the Linux \
kernel."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.7"

RPM_NAME = "conntrack-tools-1.4.7-1.3.aarch64.rpm"
RPM_HASH = "c4f7d0837776d271fe15a54a95ac6479dab8f5d5a69473783de5073d9ebbdc7b8269b2d12d7f03f960a320b25d33b2820144db7ef2ee4c01972938a93ab95b9f"

RPROVIDES:${PN} += "conntrack-tools \
conntrack-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnetfilter_cthelper.so.0()(64bit) \
libnetfilter_cthelper.so.0(LIBNETFILTER_CTHELPER_1.0)(64bit) \
libnetfilter_cttimeout.so.1()(64bit) \
libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.0)(64bit) \
libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.1)(64bit)"

inherit rpm
