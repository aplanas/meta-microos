SUMMARY = "Virtual Printer for Viewing a Document before Printing"
DESCRIPTION = "Boomaga (BOOklet MAnager) is a virtual printer for viewing a document \
before printing it out using the physical printer. \
Select the 'Boomaga' printer in any program and the Boomaga window \
opens in several seconds (CUPS takes some time to respond). \
If you print out one more document, it gets added to the previous one, \
and you can also print them out as one. \
Regardless of whether your printer supports duplex printing or not, you \
would be able to easily print on both sides of the sheet."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "boomaga-3.0.0-3.12.aarch64.rpm"
RPM_HASH = "9771b4566162a3fc7d4169a0bbe490012619c0ef6408a4a10ddccca05f374c5fb343787e2d50c378120a3334d3adc8b72eaa8e126a425f60e4bf9fd4c979acef"

RPROVIDES:${PN} += "boomaga \
postscriptdriver-generic;boomaga-printer;"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/lpadmin \
ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-cpp.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
