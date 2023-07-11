SUMMARY = "Libskk input method engine for Fcitx5"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.15"

RPM_NAME = "fcitx5-skk-5.0.15-1.2.aarch64.rpm"
RPM_HASH = "bc69188794991ace17aa68a12a2b8b9d823f610ecd764b31ab9216e193eca80ac1301a2f8009ef96f68ea75cd7ca0e687f3b35e19ea0969081b00ab517854432"

RPROVIDES:${PN} += "fcitx-skk \
fcitx5-skk \
libfcitx5-skk-config.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libskk.so.0 \
libstdc++.so.6"

inherit rpm
