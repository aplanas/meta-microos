SUMMARY = "Qt string template library"
DESCRIPTION = "Grantlee is a string template engine based on the Django template system and \
written in Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "grantlee5-5.3.1-2.1.aarch64.rpm"
RPM_HASH = "824d575cbfad7890f45d7dc93cb496cf68767086157fe484143060e7c89e8e6996d75f322225b6a438fc226d2a41e9313f5fed3fbfbff5dd661252fd2d0a7ab3"

RPROVIDES:${PN} += "grantlee5 \
libGrantlee-Templates.so.5 \
libGrantlee-TextDocument.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
