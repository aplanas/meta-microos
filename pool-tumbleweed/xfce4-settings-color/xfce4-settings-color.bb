SUMMARY = "Subpackage providing xfce4-color-settings"
DESCRIPTION = "The Xfce Color Profile settings tool is a front-end to set up color management \
for printers, scanners, and displays."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-color-4.18.2-1.3.aarch64.rpm"
RPM_HASH = "55229d2568ce2e3eaa9cd084aeaf7a47e7842559bf79e56df2b71490d077d61acd9e483ae1719e6ce211bc5c4c74f4845cfbb28691e82f585858c1811aa77514"

RPROVIDES:${PN} += "application() \
application(xfce4-color-settings.desktop) \
xfce4-color-settings \
xfce4-settings-color \
xfce4-settings-color(aarch-64)"

RDEPENDS:${PN} += "colord \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcolord.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
sane-backends \
xfce4-settings \
xiccd"

inherit rpm
