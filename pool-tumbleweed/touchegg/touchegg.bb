SUMMARY = "A multitouch gesture recogniser for GNU/Linux"
DESCRIPTION = "Touchegg is an app that runs in the background and transforms the \
gestures you make on your touchpad or touchscreen into visible \
actions in your desktop."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.0.16"

RPM_NAME = "touchegg-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "04ec0284b797ffd69492bf430a50795d00d912bef80ec87d51be6860aeb4a17db01170723be105ce90f31c9b1278e03cb034946fc25f6197f2c086bc54eba1c6"

RPROVIDES:${PN} += "touchegg"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput.so.10 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
