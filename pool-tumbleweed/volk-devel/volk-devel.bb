SUMMARY = "Development files for VOLK"
DESCRIPTION = "This package provides the the development files for VOLK."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk-devel-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "65e15d8a0a166a621accef0354468d769ba51f4c598ec12c3d1d771e040185e90e74cd2c77b80adcf6e07042d3727c7b693c1480411ab765b294f2381edd3335"

RPROVIDES:${PN} += "cmake-Volk \
gnuradio-devel-/usr/lib64/pkgconfig/volk.pc \
pkgconfig-volk \
volk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk.so.3.0 \
libvolk3-0"

inherit rpm
