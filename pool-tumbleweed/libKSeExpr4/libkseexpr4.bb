SUMMARY = "kseexpr libraries"
DESCRIPTION = "Runtime libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "libKSeExpr4-4.0.4.0-1.11.aarch64.rpm"
RPM_HASH = "e7c511efa24180174773fb7d8a6d3fcb0272b04f1644ac2deb4dcad8ee955a8e1f1c88496b4b8ce3eab4866289b8a71714bc59506998f8cd1ffaac4b5e5644f5"

RPROVIDES:${PN} += "kseexpr \
libKSeExpr.so.4 \
libKSeExpr4 \
libKSeExprUI.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
