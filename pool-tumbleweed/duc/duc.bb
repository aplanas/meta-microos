SUMMARY = "Collection of tools for inspecting and visualizing disk usage"
DESCRIPTION = "Duc is a collection of tools for inspecting and visualizing disk usage. \
 \
Duc scales quite well, it has been tested on systems with more than 500 million files and several petabytes of storage."
LICENSE = "LGPL-3.0-only"

PV = "1.4.5"

RPM_NAME = "duc-1.4.5-1.4.aarch64.rpm"
RPM_HASH = "3e1d56066cc38e8aaf9b612d7e58370e89f8cc868a30357c855e2bca5d9ca6aab06491c26d629037eb7a67f9cdfa6b936793762a00eda829c7f4476bfe656d7b"

RPROVIDES:${PN} += "duc \
duc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libglfw.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
