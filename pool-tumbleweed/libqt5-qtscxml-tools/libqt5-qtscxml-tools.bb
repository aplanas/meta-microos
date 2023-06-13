SUMMARY = "Qt 5 State Chart XML tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains tools for handling Qt SCXML files."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtscxml-tools-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a0d2ee044f302698cbaad2cb147bdbf0cadde5e1284b0b8cfe0efe3c89b9b253e73f7ffe186221cd7f4da6612380bf0a88342c204d790e4d2c609b29fcf28b20"

RPROVIDES:${PN} += "libqt5-qtscxml-tools \
libqt5-qtscxml-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
