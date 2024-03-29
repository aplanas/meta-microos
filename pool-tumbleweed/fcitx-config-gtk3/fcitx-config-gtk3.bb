SUMMARY = "GTK GUI Config tool for FCITX"
DESCRIPTION = "fcitx-config GTK based configure tool for fcitx. \
 \
KDE Version see fcitx-config-kde4 or kcm-fcitx."
LICENSE = "GPL-2.0+"

PV = "0.4.10"

RPM_NAME = "fcitx-config-gtk3-0.4.10-1.25.aarch64.rpm"
RPM_HASH = "cef27c245bb3c7debc792690970f54ebad3d5ba10e22724ddf18acd0712728962419ca0ef319261fba999652c174d9092cd34076d1893327d3a1b01f1ccac149"

RPROVIDES:${PN} += "fcitx-config-gtk \
fcitx-config-gtk2 \
fcitx-config-gtk3 \
fcitx-configtool \
locale-libgnome-ko;zh-CN;zh-SG"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-core.so.0 \
libfcitx-gclient.so.1 \
libfcitx-utils.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
