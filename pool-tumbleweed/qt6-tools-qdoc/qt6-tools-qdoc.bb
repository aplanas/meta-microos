SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdoc-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1328626a4bdf48149e5ff9be7d0d52edce2beb8bcda4ceb71fa8b18a2d7dbfb7cbff73da203208c314d08f93226c35c42aa7616ec66f806dc5fc80624c121721"

RPROVIDES:${PN} += "qt6-tools-qdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
