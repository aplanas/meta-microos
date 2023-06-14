SUMMARY = "NIS client daemon"
DESCRIPTION = "This package provides the ypbind daemon. The ypbind daemon binds NIS \
clients to an NIS domain and searches a new NIS server if the old one \
goes down. \
 \
Ypbind must be running on any machines which are running NIS client \
programs."
LICENSE = "GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "ypbind-2.7.2-2.11.aarch64.rpm"
RPM_HASH = "27454365e607bd194db392f9b5b34746640799b1f7307e06091a4806365cd54ec681871deae58815f81ed55f7d7f72ad08aebadf738891041b2c07a4bd8b2d2c"

RPROVIDES:${PN} += "config-ypbind \
ypbind"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnsl.so.3 \
libnss-nis2 \
libsystemd.so.0 \
libtirpc.so.3 \
rpcbind \
yp-tools"

inherit rpm
