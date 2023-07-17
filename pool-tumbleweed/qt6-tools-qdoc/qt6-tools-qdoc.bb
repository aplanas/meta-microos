SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdoc-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "12a5f3010c05a28f8ee421122fb47310e5f93a1e60cc1893403681924aa80444d236f33dfcb6539d604df2465ce55eec1b140f7b2bedeb52c20b16f3b4108fdb"

RPROVIDES:${PN} += "qt6-tools-qdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
