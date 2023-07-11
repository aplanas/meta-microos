SUMMARY = "Compositor Configuration"
DESCRIPTION = "X composite manager configuration for compton"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "compton-conf-0.16.0-2.10.aarch64.rpm"
RPM_HASH = "7156f1e20b2da2b70f230e03cde5f2491c4111711529aa8e07c317d5c99330540d0eb72d08565f18f4904fdd01add74e53ba219c0b98702e6d7cee1ad52311f2"

RPROVIDES:${PN} += "compton-conf"

RDEPENDS:${PN} += "compton \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libconfig.so.11 \
libstdc++.so.6"

inherit rpm
