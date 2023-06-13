SUMMARY = "Daemon for Network Monitoring Tool"
DESCRIPTION = "Daemon for Argus network monitoring tool."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-server-3.0.8.3-3.3.aarch64.rpm"
RPM_HASH = "75280a5d6576ecb044fe37ac53af788ee84fbd256f53d703fd016fa8dacdd980a55b6aff9cfec0864f5db2c11528eab1dad2b84421ea5148dd7bc6db6a928598"

RPROVIDES:${PN} += "argus-server \
argus-server(aarch-64) \
argus:/usr/sbin/argus \
config(argus-server)"

RDEPENDS:${PN} += "/bin/sh \
argus \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpcap.so.1()(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
