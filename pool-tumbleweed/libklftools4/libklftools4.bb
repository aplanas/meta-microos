SUMMARY = "KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "libklftools4-4.1.0-1.14.aarch64.rpm"
RPM_HASH = "8587f7a7565e6f04fd53746481011135d76d7d873dd094ed776d3ef417e37f69a3852b50b38098352095c5c02b0773082754fd2f96232f80e4fd1eadf7712761"

RPROVIDES:${PN} += "libklftools \
libklftools.so.4 \
libklftools4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
