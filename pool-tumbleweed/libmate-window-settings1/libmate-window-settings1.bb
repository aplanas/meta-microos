SUMMARY = "Utility library for getting window manager settings"
DESCRIPTION = "This library is used by MATE control center to change preferences \
of window managers."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmate-window-settings1-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "2d7bbc1f7028513a347d66da167383405ff3ba1c1b8ff6883ada1516f290fb892a1e6b9e50b2f38bc182bd2814a1e10502557f88991d3695e21c0bb8a30982f6"

RPROVIDES:${PN} += "libmate-window-settings.so.1 \
libmate-window-settings1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libmate-desktop-2.so.17"

inherit rpm
