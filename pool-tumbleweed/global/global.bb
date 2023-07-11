SUMMARY = "Common source code tag system"
DESCRIPTION = "GLOBAL is a common source code tag system for C, C++, Yacc, and Java. \
You can locate the specified function in source files and move there \
easily. It is useful to hack a large project containing many \
subdirectories or many main() functions like MH, X, or Linux kernel."
LICENSE = "GPL-3.0-only"

PV = "6.6.10"

RPM_NAME = "global-6.6.10-1.1.aarch64.rpm"
RPM_HASH = "6f5eef818ed6820c1f5d9de3c55e87ea4cf0f716b027feb5a4240a9a63e4ad3e99fc30ae50d3124e0a18b9dde7d50f8664c3e338af6a83c24854572c4c32030c"

RPROVIDES:${PN} += "config-global \
global"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libncurses.so.6 \
libtinfo.so.6 \
python3-Pygments"

inherit rpm
