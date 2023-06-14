SUMMARY = "qpdfview plugin: PostScript documents"
DESCRIPTION = "This plugin is required to read PostScript documents \
(*.ps files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-ps-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "5ad91e0296d6bef80c681760fa5e3165b9821df4c082c3f7c47b57dffe1819b94d060a97eae15b6095f675a78f5194597db280fc3134567e329b77c6823e3e5e"

RPROVIDES:${PN} += "libqpdfview-ps.so \
qpdfview-plugin-ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libspectre.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
