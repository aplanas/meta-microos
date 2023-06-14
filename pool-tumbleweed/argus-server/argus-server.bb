SUMMARY = "Daemon for Network Monitoring Tool"
DESCRIPTION = "Daemon for Argus network monitoring tool."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-server-3.0.8.3-3.3.aarch64.rpm"
RPM_HASH = "75280a5d6576ecb044fe37ac53af788ee84fbd256f53d703fd016fa8dacdd980a55b6aff9cfec0864f5db2c11528eab1dad2b84421ea5148dd7bc6db6a928598"

RPROVIDES:${PN} += "argus-/usr/sbin/argus \
argus-server \
config-argus-server"

RDEPENDS:${PN} += "/bin/sh \
argus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1 \
libwrap.so.0"

inherit rpm
