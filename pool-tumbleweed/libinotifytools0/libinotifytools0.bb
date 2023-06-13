SUMMARY = "Library files for inotify-tools"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-WITH-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "libinotifytools0-3.22.6.0-1.4.aarch64.rpm"
RPM_HASH = "9c435d3dfcdb970c897e2f7f3b008c062b62e30f1c2f51db6df41cfdeaf24bc5c20511d345d268ae32eccd55000d018039927712701579320da2f9096471c610"

RPROVIDES:${PN} += "libinotifytools.so.0()(64bit) \
libinotifytools0 \
libinotifytools0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
