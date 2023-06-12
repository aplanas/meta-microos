SUMMARY = "Qt 6 Protobuf library - Development files"
DESCRIPTION = "Development files for the Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-protobuf-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f71d7baf6213a619e45bea22cbadc06b1679123d153f65aa6da8078eec7a66a77d7de970c4cd5cd4c9e13cf9589e899d10095ad650d2cb98fb1e42996c3c9cfb"

RPROVIDES:${PN} += "cmake(Qt6Protobuf) \
cmake(Qt6ProtobufTools) \
pkgconfig(Qt6Protobuf) \
qt6-protobuf-devel \
qt6-protobuf-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Protobuf6 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libprotoc-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
pkgconfig(Qt6Core) \
pkgconfig(protobuf)"

inherit rpm
