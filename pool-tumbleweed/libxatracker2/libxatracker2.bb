SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-349.2.aarch64.rpm"
RPM_HASH = "7f8e719deb04a0622b8d18617445ce137f636a97a194ade9fdfc5fec79d78ea2e915309c6446f02e6e1f46a4611f8b0dec640904276b352f28881db1537a576b"

RPROVIDES:${PN} += "libxatracker.so.2()(64bit) \
libxatracker2 \
libxatracker2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libdrm_nouveau.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
