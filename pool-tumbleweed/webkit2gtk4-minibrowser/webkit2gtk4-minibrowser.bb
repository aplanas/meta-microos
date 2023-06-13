SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "c5f320315473866a1112f7f52e14a06a0766a244a4ee94c4dc2a170fdd6a0c9e7ace4c83ef91ccc583d8465b6f6f4f5342bf25eeddbfdb25953a0fd5e10d00b2"

RPROVIDES:${PN} += "webkit2gtk4-minibrowser \
webkit2gtk4-minibrowser(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjavascriptcoregtk-6.0.so.1()(64bit) \
libsoup-3.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libwebkitgtk-6.0.so.4()(64bit)"

inherit rpm
