SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6"

RPM_NAME = "iwd-2.6-1.1.aarch64.rpm"
RPM_HASH = "e57fff993ec02c5fe6d209dd46c599b6420d3158035b81ffed936d8e6436127c6635e630aa60422035b7e4cbe1a1ec9dc44758c2816e0b18b2f4a06c1f659cf4"

RPROVIDES:${PN} += "iwd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libell.so.0 \
libreadline.so.8"

inherit rpm
