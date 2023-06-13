SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_debuginterfaceclient1-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "3e48475815445e2038d1854d945efe2de993811a678cdbb49955fe3a519a1ca9b944240129424a538f0b95aebe82e812961b6a19548c7e295a60abca785630c5"

RPROVIDES:${PN} += "libkdstatemachineeditor_debuginterfaceclient.so.1()(64bit) \
libkdstatemachineeditor_debuginterfaceclient1 \
libkdstatemachineeditor_debuginterfaceclient1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5RemoteObjects.so.5()(64bit) \
libQt5RemoteObjects.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkdstatemachineeditor_core.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
