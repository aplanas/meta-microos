SUMMARY = "The kernel log daemon"
DESCRIPTION = "The klogd daemon 'listens' to kernel log messages, prioritizes them, \
and routes them to either output files or to syslog daemon. \
 \
This version of klogd will optionally translate kernel addresses to \
their symbolic equivalents if provided with a system map."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "klogd-1.5.1-802.4.aarch64.rpm"
RPM_HASH = "b903a9f7091d42bb88195c59c5ee99afa5dcbde30f8b30e692cf507b0b3988ab1cea309935bec3a90e9ec0c91d7e62606ee3d672f1b939063ebd393f90c1a685"

RPROVIDES:${PN} += "klogd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
