SUMMARY = "Japanese KKC IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-kkc is a Japanese KKC IME Wrapper for Fcitx."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "fcitx-kkc-0.1.4-1.24.aarch64.rpm"
RPM_HASH = "ca3308021746c1cb53acb5624464b866b86ce0c1d04d41b6234fa60473fb2fbf891d735cce40563d9a21468b381c4c064572283ccfeb0298c924bc9a3b5490d1"

RPROVIDES:${PN} += "fcitx-kkc \
libfcitx-kkc-config.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libFcitxQt5WidgetsAddons.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkkc.so.2 \
libstdc++.so.6"

inherit rpm
