SUMMARY = "NIS client daemon"
DESCRIPTION = "This package provides the ypbind daemon. The ypbind daemon binds NIS \
clients to an NIS domain and searches a new NIS server if the old one \
goes down. \
 \
Ypbind must be running on any machines which are running NIS client \
programs."
LICENSE = "GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "ypbind-2.7.2-2.12.aarch64.rpm"
RPM_HASH = "7db3eff8e77ee2a09d2407ec8a0f1ac57e1888195e91b32c852c3974c51bccc0265ca80fc7ba1f843fcd7d9a97f4817e121aeb01cf5f29bfd6109d48650a2719"

RPROVIDES:${PN} += "config-ypbind \
ypbind"

RDEPENDS:${PN} += "/usr/bin/grep \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnsl.so.3 \
libnss-nis2 \
libsystemd.so.0 \
libtirpc.so.3 \
rpcbind \
yp-tools"

inherit rpm
