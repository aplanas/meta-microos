SUMMARY = "Information from applications consistently on the panel"
DESCRIPTION = "The indicator applet exposes Ayatana Indicators in the MATE Panel. \
Ayatana Indicators are an initiative by Canonical to provide crisp \
and clean system and application status indication. They take the \
form of an icon and associated menu, displayed (usually) in the \
desktop panel. Existing indicators include the Message Menu, \
Battery Menu and Sound menu."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-applet-indicator-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "23bfc63afe444afed075b1a3da9874b898150fe6beb8c2b4019d4b22cf3610c80a8ba48b421a9f5becd6be1cf2f9b4d6bdba2d54e0fc4c54ce1360c0db85b30b"

RPROVIDES:${PN} += "ayatana-indicator-renderer \
mate-applet-indicator \
mate-indicator-applet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libayatana-ido3-0.4.so.0 \
libayatana-indicator3.so.7 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1"

inherit rpm
