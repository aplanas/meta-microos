SUMMARY = "Dynamic resource editor for X Toolkit applications"
DESCRIPTION = "Editres is a tool that allows users and application developers to view \
the full widget hierarchy of any X Toolkit application that speaks the \
Editres protocol."
LICENSE = "X11"

PV = "1.0.8"

RPM_NAME = "editres-1.0.8-1.6.aarch64.rpm"
RPM_HASH = "634a9749905b9ce560f86d026d3618db57f1317cc5b19c80908dbd4830c7655b02b6022f637b33fbf37f652aaa17ecf52bef8764ac49536b59b1d3b4b9150746"

RPROVIDES:${PN} += "editres \
editres(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
