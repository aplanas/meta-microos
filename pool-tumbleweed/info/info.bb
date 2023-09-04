SUMMARY = "A Stand-Alone Terminal-Based Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-7.0.3-1.4.aarch64.rpm"
RPM_HASH = "37f21f8b26c921cb1280575e6cc144825dd88101a2f6d48b9ca4a38fad660fe1deac3b13c0bc24fdb0cdb9896bdb44227ad8d8cea22c62c56a6e885d6eda490e"

RPROVIDES:${PN} += "/sbin/install-info \
info"

RDEPENDS:${PN} += "/usr/bin/gunzip \
/usr/bin/gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libzio.so.1"

inherit rpm
