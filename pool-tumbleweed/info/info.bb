SUMMARY = "A Stand-Alone Terminal-Based Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "dbd65aa1768b954b1337eb25b0af5e8c83a7ffa9b0d54a37e9f86420fbb19ac62314f6b3f2f73bacc5ea00334b767acf39d7d8a26f66e9f194af99f1a992e032"

RPROVIDES:${PN} += "/sbin/install-info \
info"

RDEPENDS:${PN} += "/usr/bin/gunzip \
/usr/bin/gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libzio.so.1"

inherit rpm
