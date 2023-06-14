SUMMARY = "Coreutils Viewer"
DESCRIPTION = "This tool can be described as a Tiny Dirty Linux Only* C command that looks for coreutils basic \
commands (cp, mv, dd, tar, gzip/gunzip, cat, ...) currently running on your system and displays \
the percentage of copied data. \
 \
It can now also display an estimated throughput (using -w flag)."
LICENSE = "GPL-3.0-or-later"

PV = "0.16"

RPM_NAME = "progress-0.16-1.8.aarch64.rpm"
RPM_HASH = "3fec165af9ca1fa1d270b67aa3071f2d5b607641a3f48c925fe208e8092f1ae9b4d616304932e4af5fbf305bb770dfde638fb5e0d1100da7b9b17b51d2d83a07"

RPROVIDES:${PN} += "cv \
progress"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
