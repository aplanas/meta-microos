SUMMARY = "Voodoo video driver for the Xorg X server"
DESCRIPTION = "voodoo is an Xorg driver for Voodoo 1 and Voodoo 2 series video cards. \
 \
On the Voodoo 1 the driver uses a shadow buffer in system memory as the \
video adapter has only 3D acceleration. Selected portions of the shadow \
framebuffer are copied out to the Voodoo board at the right time. \
Because of this, the speed of the driver is very dependent on the CPU. \
Processors nowadays are actually rather fast at moving data so we get \
very good speed anyway as the shadow framebuffer is in cached RAM. \
 \
The Voodoo2 has 16bpp acceleration and the driver provides accelerated \
versions of most operations except angled lines and stipples. \
Accelerated alpha blending with the Render extension is also supported \
as is DGA. \
 \
This driver supports 16bpp modes currently. The video hardware supports \
image conversion from 24bpp to 16bpp but the hardware is 16bpp only. \
 \
The Voodoo 1 series cards can go up to 800x600 resolution while the \
Voodoo 2 can reach 1024x768 providing it has at least 2Mb of frame \
buffer memory. 1024x768 2D mode does not require two cards configured in \
scan-line interleave mode (SLI). \
 \
Multihead and Xinerama configurations are supported. SLI configurations \
will be treated as multiple video cards. \
 \
Limited support for DPMS screen saving is available. The 'standby' and \
'suspend' modes are just painting the screen black. The 'off' mode turns \
the Voodoo board off and thus works correctly. \
 \
This driver does not support a virtual screen size different from the \
display size. This is a hardware limitation. 3D rendering is also not \
supported."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "xf86-video-voodoo-1.2.6-1.2.aarch64.rpm"
RPM_HASH = "a4180f7b72dd0914c5fa54f9abb8c4c33bc098c57e3770be7faed9849dfc6a3e606979e9455950e992b1c0602e4934114c24698a134fea8d80294270d142e706"

RPROVIDES:${PN} += "xf86-video-voodoo \
xf86-video-voodoo(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
