SUMMARY = "Utilities for controlling team network devices"
DESCRIPTION = "This package contains frontends to libteam that allow changing \
the (team-specific) properties of team devices. \
(The general configuration of network devices can be done \
through using iproute.) \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1+"

PV = "1.31"

RPM_NAME = "libteam-tools-1.31-3.8.aarch64.rpm"
RPM_HASH = "70517ac67f3978bcbe5ad15608c3bb792c131ac14e48b7810e96697a70f212e868605c3adfd067d41a7b2ffbe3e8b2fb392b531d6170d9e538d224680aa88166"

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
