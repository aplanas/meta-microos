SUMMARY = "Examples for the qt6-quickeffectmaker modules"
DESCRIPTION = "Examples for the qt6-quickeffectmaker modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffectmaker-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "25afd333fb242f6b58b4f8bb5812e74dc17b6480f61459650a4a9298cd36b45743475d50c529259e6b03560de3283a177e012737c3aca288f5de81c7ec5f6089"

RPROVIDES:${PN} += "qt6-quickeffectmaker-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
