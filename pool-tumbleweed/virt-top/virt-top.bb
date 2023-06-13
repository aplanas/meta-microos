SUMMARY = "Utility like top(1) for displaying virtualization stats"
DESCRIPTION = "virt-top is a 'top(1)'-like utility for showing stats of virtualized \
domains.  Many keys and command line options are the same as for \
ordinary 'top'. \
 \
It uses libvirt so it is capable of showing stats across a variety of \
different virtualization systems."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "virt-top-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "7a18f5f69b0e8e9291b4fa502f079ce66fbffb58ef45c1111e2d4a9ad0b3d628da6883063b566685462ec9f211b6e862aa27c8c1f2ae0eb6c3b6a3c14150b344"

RPROVIDES:${PN} += "ocamlfind(virt-top) \
virt-top \
virt-top(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libvirt.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
