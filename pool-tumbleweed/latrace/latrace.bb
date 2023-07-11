SUMMARY = "Trace Library Calls using LD_AUDIT"
DESCRIPTION = "latrace is a glibc 2.4+ LD_AUDIT frontend. It allows you to trace library calls \
and get their statistics in a manner similar to the strace utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.11"

RPM_NAME = "latrace-0.5.11-13.7.aarch64.rpm"
RPM_HASH = "cf94a5faf395bb28be4a02f2e8fed691f4c1e82656d85dc74b37330f68fe2354ccd8d4d011b0fffec2460c1d9cb2047cd76eac97fca96628430644261ce6f282"

RPROVIDES:${PN} += "config-latrace \
latrace \
libltaudit.so.0.5.11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
