SUMMARY = "AMDGPU video driver for the Xorg X server"
DESCRIPTION = "amdgpu is an Xorg driver for AMD video cards. \
 \
Its autodetects whether your hardware has a CI or newer AMD Graphics Card"
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "xf86-video-amdgpu-23.0.0-1.4.aarch64.rpm"
RPM_HASH = "f96e744593915210cbfa792709cb25f835219734ff06394b79f084274c15b908630360b43aefb8931a2d08ed9a5766d38f5f4a06233453c0aac2393d429cb8f9"

RPROVIDES:${PN} += "xf86-video-amdgpu"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libgbm.so.1 \
libudev.so.1"

inherit rpm
