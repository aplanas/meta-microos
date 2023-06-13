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

RPM_NAME = "boomaga-3.0.0-3.11.aarch64.rpm"
RPM_HASH = "40cc76029d0be103b22e34f270b772a49df9712832e4f95b881bfcf737ee95eb0eb977992907812038f5db45b0436e91bfbc7785c76ece11f2880ed60fd3c0ff"

RPROVIDES:${PN} += "application() \
application(boomaga.desktop) \
boomaga \
boomaga(aarch-64) \
mimehandler(application/x-boomaga-boo) \
postscriptdriver(generic;boomaga_printer;)"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/lpadmin \
ghostscript \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcups.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpoppler-cpp.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
