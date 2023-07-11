SUMMARY = "A multitouch gesture recogniser for GNU/Linux"
DESCRIPTION = "Touchegg is an app that runs in the background and transforms the \
gestures you make on your touchpad or touchscreen into visible \
actions in your desktop."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.0.16"

RPM_NAME = "touchegg-2.0.16-1.2.aarch64.rpm"
RPM_HASH = "f234f625697c2f0ef11a183b4fe603f86d29d19b1ddda52ea761d00293bd987a24588c035e43371f749fa9d93709bb317d184e62aec326fbc8861d1fbc87a9f8"

RPROVIDES:${PN} += "touchegg"

RDEPENDS:${PN} += "/usr/bin/sh \
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
