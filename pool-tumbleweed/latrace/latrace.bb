SUMMARY = "Trace Library Calls using LD_AUDIT"
DESCRIPTION = "latrace is a glibc 2.4+ LD_AUDIT frontend. It allows you to trace library calls \
and get their statistics in a manner similar to the strace utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.11"

RPM_NAME = "latrace-0.5.11-13.6.aarch64.rpm"
RPM_HASH = "a21818cb7aaee496c44e02dc2c34cc2c6b926bad4f5f8088dada4fd49aecb11c594ad2ae5c52f3de28ae7920895e8e20e3be6c10bd63992b9dbd785ef4873d05"

RPROVIDES:${PN} += "config(latrace) \
latrace \
latrace(aarch-64) \
libltaudit.so.0.5.11()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
