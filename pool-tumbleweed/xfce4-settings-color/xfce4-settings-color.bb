SUMMARY = "Subpackage providing xfce4-color-settings"
DESCRIPTION = "The Xfce Color Profile settings tool is a front-end to set up color management \
for printers, scanners, and displays."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-settings-color-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "ce60e25f82863742deaa14f52b4ae3f50ab6891e69aa7269b7e0a6fa5e90cf080bfd6ada9733e594558717c1f816de0dcfeb8bf1f89d5e85efc8e609da646b6f"

RPROVIDES:${PN} += "xfce4-color-settings \
xfce4-settings-color"

RDEPENDS:${PN} += "colord \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcolord.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
sane-backends \
xfce4-settings \
xiccd"

inherit rpm
