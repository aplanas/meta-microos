SUMMARY = "Qt string template library"
DESCRIPTION = "Grantlee is a string template engine based on the Django template system and \
written in Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "grantlee5-5.3.1-2.1.aarch64.rpm"
RPM_HASH = "824d575cbfad7890f45d7dc93cb496cf68767086157fe484143060e7c89e8e6996d75f322225b6a438fc226d2a41e9313f5fed3fbfbff5dd661252fd2d0a7ab3"

RPROVIDES:${PN} += "grantlee5 \
grantlee5(aarch-64) \
libGrantlee_Templates.so.5()(64bit) \
libGrantlee_TextDocument.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
