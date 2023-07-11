SUMMARY = "A Stand-Alone Terminal-Based Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-7.0.3-1.3.aarch64.rpm"
RPM_HASH = "28dc6cce92d2edb9ca3ce84de851196ba4848ca873dca204a44667f219c1658d6d629ffe4f61caf00ff23ea52e26df52d9de81f5da7fbb406f27b2ab345b82e6"

RPROVIDES:${PN} += "/sbin/install-info \
info"

RDEPENDS:${PN} += "/usr/bin/gunzip \
/usr/bin/gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libzio.so.1"

inherit rpm
