SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8"

RPM_NAME = "iwd-2.8-1.1.aarch64.rpm"
RPM_HASH = "462d6eab16caea2de608ac378c6d2da94f53d27535cca075b3141747647244c9a4a88a1c592996cd82956b2c19886b911539fbaea4c2f29a06f96980708475bf"

RPROVIDES:${PN} += "iwd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libell.so.0 \
libreadline.so.8"

inherit rpm
