SUMMARY = "Subpackage providing xfce4-color-settings"
DESCRIPTION = "The Xfce Color Profile settings tool is a front-end to set up color management \
for printers, scanners, and displays."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-color-4.18.2-1.3.aarch64.rpm"
RPM_HASH = "55229d2568ce2e3eaa9cd084aeaf7a47e7842559bf79e56df2b71490d077d61acd9e483ae1719e6ce211bc5c4c74f4845cfbb28691e82f585858c1811aa77514"

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
