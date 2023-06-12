SUMMARY = "Utility to list X resources in widgets"
DESCRIPTION = "The listres program generates a list of X resources for a widget \
in an X client written using a toolkit based on libXt."
LICENSE = "X11"

PV = "1.0.5"

RPM_NAME = "listres-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "099e721f5bc0cedaf3e5978dcd348ea2edb65d94910180d6ba59d67660d25d7bf101a900491d0fa05007761ed9aaba40673d37785d8e7b70ccbdddc677b25a72"

RPROVIDES:${PN} += "listres \
listres(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
