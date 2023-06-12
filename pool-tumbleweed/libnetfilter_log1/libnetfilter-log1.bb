SUMMARY = "Userspace library for accessing logged packets"
DESCRIPTION = "libnetfilter_log is a userspace library providing interface to \
packets that have been logged by the kernel packet filter. It is is \
part of a system that deprecates the old syslog/dmesg based packet \
logging. This library has been previously known as libnfnetlink_log."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnetfilter_log1-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "0439f6634f4b7e349f1d45b72bc5db160841eb35be380b15525000e6d2322937c654fe9e28fe669a4e96a5ad590216ce9f5cb70676737d09fa20b027b273868f"

RPROVIDES:${PN} += "libnetfilter_log.so.1()(64bit) \
libnetfilter_log1 \
libnetfilter_log1(aarch-64) \
libnetfilter_log_libipulog.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libnfnetlink.so.0()(64bit) \
libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit)"

inherit rpm
