SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "dc91f5444ef64ba4852f838510dced64a7fb6cd0204c33728c258c48e6accc482cb790e31c25d5e26c7c22a23bdc1e26ef14d9182cf5e589b91035d1964534a5"

RPROVIDES:${PN} += "libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Qt5WidgetsAddons2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
