SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdoc-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e723a0703f470f615c446a436c120fbbbe6e1385f9679f0eaffaa0db169577dfd45328848fbfec03279317623e728c8a1d299237266e6106416261231a345344"

RPROVIDES:${PN} += "qt6-tools-qdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
