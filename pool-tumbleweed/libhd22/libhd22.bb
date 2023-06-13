SUMMARY = "Hardware detection library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "22.2"

RPM_NAME = "libhd22-22.2-1.3.aarch64.rpm"
RPM_HASH = "cab6c525b8446210916b18af938d7adf7d8b1ae50556b98bb6c319e911f1b0ad9a531c646761f79135ea4ae6cad7ef303adecf088b1e270e4e76e413fa184218"

RPROVIDES:${PN} += "libhd \
libhd.so.22()(64bit) \
libhd22 \
libhd22(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
