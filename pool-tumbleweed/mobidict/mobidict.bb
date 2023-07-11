SUMMARY = "A dictionary viewer for AZW/MOBI files"
DESCRIPTION = "A dictionary viewer for AZW/MOBI files."
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "mobidict-1.2-1.25.aarch64.rpm"
RPM_HASH = "c045943c789f4c3078a3f66d9f175e8f169b386b796de5b815591866fd6270182909dea81bb0ef6dbf43ddedfb19a1df4573f54080cf81eaba5ae25d6ee3631b"

RPROVIDES:${PN} += "mobidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
