SUMMARY = "Qt 5 State Chart XML Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt SCXML module provides functionality to create state machines \
from SCXML files. This includes both dynamically creating state \
machines (loading the SCXML file and instantiating states and \
transitions) and generating a C++ file that has a class implementing \
the state machine. It also contains functionality to support data \
models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Scxml5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "479496b66eebd673ce372f8558cd1e988c222f1645ef4b9c4ff923544683fa5c239da9e220a450fb9dbd93eb823f590497aac0c7317e94f5062735df1d12c574"

RPROVIDES:${PN} += "libQt5Scxml.so.5()(64bit) \
libQt5Scxml.so.5(Qt_5)(64bit) \
libQt5Scxml.so.5(Qt_5.0)(64bit) \
libQt5Scxml.so.5(Qt_5.1)(64bit) \
libQt5Scxml.so.5(Qt_5.10)(64bit) \
libQt5Scxml.so.5(Qt_5.11)(64bit) \
libQt5Scxml.so.5(Qt_5.12)(64bit) \
libQt5Scxml.so.5(Qt_5.13)(64bit) \
libQt5Scxml.so.5(Qt_5.14)(64bit) \
libQt5Scxml.so.5(Qt_5.15)(64bit) \
libQt5Scxml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Scxml.so.5(Qt_5.2)(64bit) \
libQt5Scxml.so.5(Qt_5.3)(64bit) \
libQt5Scxml.so.5(Qt_5.4)(64bit) \
libQt5Scxml.so.5(Qt_5.5)(64bit) \
libQt5Scxml.so.5(Qt_5.6)(64bit) \
libQt5Scxml.so.5(Qt_5.7)(64bit) \
libQt5Scxml.so.5(Qt_5.8)(64bit) \
libQt5Scxml.so.5(Qt_5.9)(64bit) \
libQt5Scxml5 \
libQt5Scxml5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
