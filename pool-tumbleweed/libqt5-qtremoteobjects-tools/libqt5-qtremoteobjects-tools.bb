SUMMARY = "Qt 5 RemoteObjects Tools"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtremoteobjects-tools-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "f5a72aaf350e5e25123bef35d7fc3690bba63d21fc089335cc2dbc9076f093edb709512496e368ab7f8e7cace5977f9cf116d4bd7e88c5fececac449373c5a5c"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
