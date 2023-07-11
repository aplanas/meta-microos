SUMMARY = "Utilities for controlling team network devices"
DESCRIPTION = "This package contains frontends to libteam that allow changing \
the (team-specific) properties of team devices. \
(The general configuration of network devices can be done \
through using iproute.) \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.31"

RPM_NAME = "libteam-tools-1.31-4.1.aarch64.rpm"
RPM_HASH = "155942c3e1f0b757629ae6bae3ba57f0ae00380a200e50dfc2a6b8a514c417aba4f023c8bbd37a558151dec814a87e3c9ef8952550ee279e8748c9229587f4f3"

RPROVIDES:${PN} += "config-libteam-tools \
libteam-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdaemon.so.0 \
libdbus-1.so.3 \
libjansson.so.4 \
libteam.so.5 \
libteamdctl.so.0"

inherit rpm
