SUMMARY = "NVidia Optimus support for GNU/Linux aimed at stability"
DESCRIPTION = "The Bumblebee daemon is a rewrite of the original Bumblebee service, \
providing a means of managing Optimus hybrid graphics chipsets. This \
project not only enables use of the discrete GPU for rendering, but \
also smart power management of the dGPU when it is not in use."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "bumblebee-3.2.1-14.12.aarch64.rpm"
RPM_HASH = "5a8082944f6565b522898a18ee5f253599f5873e2056742392236b1b7c99c497586a7025c3dfd74ef27abddd9df0b18bb13ca00cccd765d1e3e74c72f664a7a0"

RPROVIDES:${PN} += "bumblebee \
config-bumblebee"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
VirtualGL \
kmod-compat \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
pciutils \
primus \
shadow \
sudo \
systemd \
xorg-x11-libX11"

inherit rpm
