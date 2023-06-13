SUMMARY = "Japanese KKC IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-kkc is a Japanese KKC IME Wrapper for Fcitx."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "fcitx-kkc-0.1.4-1.24.aarch64.rpm"
RPM_HASH = "ca3308021746c1cb53acb5624464b866b86ce0c1d04d41b6234fa60473fb2fbf891d735cce40563d9a21468b381c4c064572283ccfeb0298c924bc9a3b5490d1"

RPROVIDES:${PN} += "fcitx-kkc \
fcitx-kkc(aarch-64) \
libfcitx-kkc-config.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libFcitxQt5WidgetsAddons.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libkkc.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
