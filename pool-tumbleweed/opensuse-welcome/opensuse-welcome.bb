SUMMARY = "Welcome utility for openSUSE"
DESCRIPTION = "A welcome utility built to welcome new users to openSUSE."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.9+git.0.66be0d8"

RPM_NAME = "opensuse-welcome-0.1.9+git.0.66be0d8-1.2.aarch64.rpm"
RPM_HASH = "9afbb8d3cb406777b6d17db371b172c22b0dae81bac564060cb5e670e4317db653201411baed0122d57de846c741451bb4f75c9f8c16fb1f32902885d361dd2f"

RPROVIDES:${PN} += "opensuse-welcome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
