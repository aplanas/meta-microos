SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-tools-qdoc-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2c94a18b9cdd1535697ab269cf5db456a71347348e691b8ecbebe08cfb6a054747c93a3e0662732888775df1053285d5f98ba6477a8a7aa14858b71068c7f4f4"

RPROVIDES:${PN} += "qt6-tools-qdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
