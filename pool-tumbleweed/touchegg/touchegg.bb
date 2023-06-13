SUMMARY = "A multitouch gesture recogniser for GNU/Linux"
DESCRIPTION = "Touchegg is an app that runs in the background and transforms the \
gestures you make on your touchpad or touchscreen into visible \
actions in your desktop."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.0.16"

RPM_NAME = "touchegg-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "04ec0284b797ffd69492bf430a50795d00d912bef80ec87d51be6860aeb4a17db01170723be105ce90f31c9b1278e03cb034946fc25f6197f2c086bc54eba1c6"

RPROVIDES:${PN} += "touchegg \
touchegg(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libinput.so.10()(64bit) \
libm.so.6()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
