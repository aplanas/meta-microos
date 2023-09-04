SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Completion5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "90f9270d82b98c78bfd936134883c013d4f7bc2dfbdb739ada6ed91530b8385d84016fe1476cdaa0fb8275da25537654e8da1ca64f8e9a884bff42215a6e5f48"

RPROVIDES:${PN} += "libKF5Completion.so.5 \
libKF5Completion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
