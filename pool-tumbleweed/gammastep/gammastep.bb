SUMMARY = "Adjusts the color temperature of your screen according to time of day"
DESCRIPTION = "Gammastep adjusts the color temperature of your screen according to your \
surroundings. This may help your eyes hurt less if you are working in front \
of the screen at night. \
 \
The color temperature is set according to the position of the sun. A different \
color temperature is set during night and daytime. During twilight and early \
morning, the color temperature transitions smoothly from night to daytime \
temperature to allow your eyes to slowly adapt. \
 \
Gammastep supports wlr-gamma-control-unstable-v1 protocol for wlroots-based \
wayland compositors."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.9"

RPM_NAME = "gammastep-2.0.9-1.2.aarch64.rpm"
RPM_HASH = "0d721c06975601e0bca999cbc7d4949044678e75e0c36187a73de967e22d89fbec9753359bdd100a3a29c35fbc10668527be11215bdbc58922d433c1f63a45d2"

RPROVIDES:${PN} += "application() \
application(gammastep.desktop) \
gammastep \
gammastep(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
