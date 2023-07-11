SUMMARY = "ATI Mach64 series video driver for the Xorg X server"
DESCRIPTION = "mach64 is an Xorg driver for ATI Mach64 series video cards."
LICENSE = "MIT"

PV = "6.9.7"

RPM_NAME = "xf86-video-mach64-6.9.7-1.5.aarch64.rpm"
RPM_HASH = "542bb3dd41f8c52d6891c17828d8895951696112596c7318ab346e386caec67d75e1fb86ab6958cdfb3bbe662c7229437c592e6d932eda5f9f541330f4fafed3"

RPROVIDES:${PN} += "xf86-video-mach64"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
