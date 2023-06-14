SUMMARY = "Distributed I/O Daemon - a 9P file server"
DESCRIPTION = "This package contains diod, a multi-threaded, user space file server \
that speaks 9P2000.L protocol."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.24+53.g0d87511"

RPM_NAME = "diod-1.0.24+53.g0d87511-4.2.aarch64.rpm"
RPM_HASH = "0d4f404ae6c03c6925134c532ab5789919e3ab1fcfded70158ab141fd99b728e77abf4bb5540d051473f8080290007016d2c1c73d22d6782c717acacdc703491"

RPROVIDES:${PN} += "config-diod \
diod"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libmunge.so.2 \
libncurses.so.6 \
libtinfo.so.6 \
libwrap.so.0"

inherit rpm
