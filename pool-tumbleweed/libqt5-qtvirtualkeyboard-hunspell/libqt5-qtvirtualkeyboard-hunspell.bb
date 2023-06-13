SUMMARY = "Hunspell Plugin for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides a hunspell spell checking plugin for the Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-hunspell-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "bf45abb4fb3aa5ef21d28f081a7c553153b6b76ab700f096966c3ce5133ce5a9e2190e30b867bc79393607cb59eb6ad1dcf0ef4b983e27295b976ae5094012a1"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-hunspell \
libqt5-qtvirtualkeyboard-hunspell(aarch-64) \
libqtvirtualkeyboard_hunspell.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5HunspellInputMethod.so.5()(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5VirtualKeyboard.so.5()(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libqt5-qtvirtualkeyboard \
libstdc++.so.6()(64bit)"

inherit rpm
