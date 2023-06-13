SUMMARY = "VDPAU wrapper library"
DESCRIPTION = "This package contains the libvdpau wrapper library and the libvdpau_trace \
debugging library, along with the header files needed to build VDPAU \
applications.  To actually use a VDPAU device, you need a vendor-specific \
implementation library.  Currently, this is always libvdpau_nvidia.  You can \
override the driver name by setting the VDPAU_DRIVER environment variable."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau1-1.5-1.6.aarch64.rpm"
RPM_HASH = "9aee54ae7575d3f09da51fcedc71ffbb94f2201d2b2e52c84aad94c4a2c32992c66052a42cb1f3f0caed000134276c14e008aa79e2661cce1989e226658221fd"

RPROVIDES:${PN} += "libvdpau \
libvdpau.so.1()(64bit) \
libvdpau1 \
libvdpau1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
