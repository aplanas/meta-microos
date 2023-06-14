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
libvdpau.so.1 \
libvdpau1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
