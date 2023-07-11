SUMMARY = "Development files for the Dynamic-to-Persistent allocation library"
DESCRIPTION = "The libvmmalloc library transparently converts all the dynamic memory \
allocations into persistent memory allocations. This allows the use \
of persistent memory as volatile memory without modifying the target \
application. \
 \
This subpackage contains libraries and header files for developing \
applications that want to specifically make use of libvmmalloc."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmmalloc-devel-1.8-2.10.aarch64.rpm"
RPM_HASH = "be5c4cecd263c8bb8bd8198651eb187e4a64e940ee83ca4117ac82aa408230ddcddc4394b73cdf0bf236c68e6c8980371bdcfefd0c67be3c77d60a4675f5a214"

RPROVIDES:${PN} += "libvmmalloc-devel \
libvmmalloc.so.1 \
pkgconfig-libvmmalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvmmalloc1"

inherit rpm
