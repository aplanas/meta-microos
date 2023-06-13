SUMMARY = "Common source code tag system"
DESCRIPTION = "GLOBAL is a common source code tag system for C, C++, Yacc, and Java. \
You can locate the specified function in source files and move there \
easily. It is useful to hack a large project containing many \
subdirectories or many main() functions like MH, X, or Linux kernel."
LICENSE = "GPL-3.0-only"

PV = "6.6.9"

RPM_NAME = "global-6.6.9-1.3.aarch64.rpm"
RPM_HASH = "f6bf1a1e22566d5a54a67f05a781a618ec1e3e3c2dc16d45e949dc6c421a1980ce4309cabc0ef6f8eb452ecec2d1f2ebc7509fe201c112b284cb378a85697ac1"

RPROVIDES:${PN} += "config(global) \
global \
global(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libltdl.so.7()(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit) \
python3-Pygments"

inherit rpm
