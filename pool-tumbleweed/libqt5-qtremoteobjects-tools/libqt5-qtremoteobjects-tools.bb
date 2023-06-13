SUMMARY = "Qt 5 RemoteObjects Tools"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtremoteobjects-tools-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "b6a295eba87884463b2f22d3f7ab7cd1c37bcd205c58f37b495295f91023be8c5a2f54787c5f935f6852fd045b03f2e2ad308fcd013b7625bb44636c92f2876f"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-tools \
libqt5-qtremoteobjects-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
