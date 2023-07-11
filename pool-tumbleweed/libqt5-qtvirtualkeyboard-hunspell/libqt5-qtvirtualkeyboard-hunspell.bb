SUMMARY = "Hunspell Plugin for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides a hunspell spell checking plugin for the Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-hunspell-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d7a97543e18ed83d6330af41c05e0b76ff3242dd7267b0009fad1852302937967d6b95ff14506fa458d1d9e9d6150da1bfa374bb5e3c9c4195f1fd0ae12ed5d7"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-hunspell \
libqtvirtualkeyboard-hunspell.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5HunspellInputMethod.so.5 \
libQt5Qml.so.5 \
libQt5VirtualKeyboard.so.5 \
libc.so.6 \
libqt5-qtvirtualkeyboard \
libstdc++.so.6"

inherit rpm
