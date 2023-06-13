SUMMARY = "Userspace library for accessing logged packets"
DESCRIPTION = "libnetfilter_log is a userspace library providing interface to \
packets that have been logged by the kernel packet filter. It is is \
part of a system that deprecates the old syslog/dmesg based packet \
logging. This library has been previously known as libnfnetlink_log."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnetfilter_log-devel-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "b2f1910b8fed40e0c774afe3e3010f71ee96ae349b03defeed14c2eb1154c1837b9a9d34e420d5532368556dc94ea489515e09a23e090199511144794853bbaa"

RPROVIDES:${PN} += "libnetfilter_log-devel \
libnetfilter_log-devel(aarch-64) \
pkgconfig(libnetfilter_log) \
pkgconfig(libnetfilter_log_libipulog)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter_log1 \
libnfnetlink-devel \
pkgconfig(libmnl) \
pkgconfig(libnetfilter_log) \
pkgconfig(libnfnetlink)"

inherit rpm
