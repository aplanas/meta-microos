SUMMARY = "Distributed I/O Daemon - a 9P file server"
DESCRIPTION = "This package contains diod, a multi-threaded, user space file server \
that speaks 9P2000.L protocol."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.24+53.g0d87511"

RPM_NAME = "diod-1.0.24+53.g0d87511-4.3.aarch64.rpm"
RPM_HASH = "c6fb33cbe1b67cbd72efe6567a80fa6300d342c861b54bbae360666abd9953c1032a1deee136b758cc1bd6164089d4b324fd19553985d73e18d5b9ef6d73bce1"

RPROVIDES:${PN} += "config-diod \
diod"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libmunge.so.2 \
libncurses.so.6 \
libtinfo.so.6 \
libwrap.so.0"

inherit rpm
