SUMMARY = "libkdepim library"
DESCRIPTION = "The libkdepim library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Libkdepim5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bf25248e4c54b6b5442c28125ef81b96371e15add37579408a3566abc12afe3b6f3441a74026da8c7e4cc73527ac56a713b0b5f60ea61ebdd80464f2d0bae2bc"

RPROVIDES:${PN} += "libKPim5Libkdepim.so.5 \
libKPim5Libkdepim5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkdepim \
libstdc++.so.6"

inherit rpm
