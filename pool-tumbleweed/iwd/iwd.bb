SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.7"

RPM_NAME = "iwd-2.7-1.1.aarch64.rpm"
RPM_HASH = "d2f489cd17cd39705808b9bfbe9949f809e24cb60b74045f942d5ecb6b7e057052a040305005d873386da7db04ba3c4d115275e25e382b69b8b251ae322a2af8"

RPROVIDES:${PN} += "iwd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libell.so.0 \
libreadline.so.8"

inherit rpm
