SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to set the custom status when you see the video in \
selected video player."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-videostatusplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "67a2d32bcfef0f5ba188b6fe0b47de77ba5d5cca9b767a4419f87647407619a56cc3c6b8b04fb3320fd02f6e14e81e50f2574c68336441e6a7f630b13d8d4f7f"

RPROVIDES:${PN} += "libvideostatusplugin.so \
psi+-plugins-videostatusplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
psi+"

inherit rpm
