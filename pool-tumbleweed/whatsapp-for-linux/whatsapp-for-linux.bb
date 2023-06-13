SUMMARY = "WhatsApp for Linux"
DESCRIPTION = "An unofficial WhatsApp desktop application written in C++."
LICENSE = "GPL-3.0-only"

PV = "1.6.3"

RPM_NAME = "whatsapp-for-linux-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "d4eae8cd943a0378e746d4907cafdf793963bcc78e7d946b4208b34de8de276829ae146734b191849c620576a07b2a84c01ae0ab2e69b2ee279ad3cabce6d45e"

RPROVIDES:${PN} += "application() \
application(com.github.eneshecan.WhatsAppForLinux.desktop) \
metainfo() \
metainfo(com.github.eneshecan.WhatsAppForLinux.appdata.xml) \
mimehandler(x-scheme-handler/whatsapp) \
whatsapp-for-linux \
whatsapp-for-linux(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libayatana-appindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanberra.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
