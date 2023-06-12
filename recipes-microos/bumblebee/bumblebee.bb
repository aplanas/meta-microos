SUMMARY = "NVidia Optimus support for GNU/Linux aimed at stability"
DESCRIPTION = "The Bumblebee daemon is a rewrite of the original Bumblebee service, \
providing a means of managing Optimus hybrid graphics chipsets. This \
project not only enables use of the discrete GPU for rendering, but \
also smart power management of the dGPU when it is not in use."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "bumblebee-3.2.1-14.11.aarch64.rpm"
RPM_HASH = "e48f7fb2012d45ebf2ac6b11626fc493d68aca6a2b2a7107648b4cade3f08fa2108f82fd7f5c40166ffd984275c6bcb5103bf5f91a935c328fc8f646aac98e15"

RPROVIDES:${PN} += "bumblebee \
bumblebee(aarch-64) \
config(bumblebee)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
VirtualGL \
kmod-compat \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
pciutils \
primus \
shadow \
sudo \
systemd \
xorg-x11-libX11"

inherit rpm
