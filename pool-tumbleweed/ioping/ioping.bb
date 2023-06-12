SUMMARY = "A tool to monitor I/O latency in real time"
DESCRIPTION = "A tool to monitor I/O latency in real time. It shows disk latency in the \
same way as ping shows network latency."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "ioping-1.3-1.2.aarch64.rpm"
RPM_HASH = "4949455a480f9e615ace99144ee99e8b6df52600e2801f13a83d52214d5e7fbfa0460c3c43de8cd931f50fdf475d56a22c628cf5cf319e486850bf5ca4554dea"

RPROVIDES:${PN} += "ioping \
ioping(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
