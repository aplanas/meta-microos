SUMMARY = "Support Utilities for NFS"
DESCRIPTION = "This package contains common NFS utilities which are needed for client \
and kernel based server."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.3"

RPM_NAME = "nfs-client-2.6.3-39.2.aarch64.rpm"
RPM_HASH = "6c5321994730b195201fcd1621637a7a1c0350ba692b9d36521282135c06cd75ba75dea115a396a68d1aad4f38b4ff6c6175351b8c0427353a5e5da56e36435a"

RPROVIDES:${PN} += "config-nfs-client \
group-statd \
nfs-client \
user-statd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
keyutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libdevmapper.so.1.03 \
libevent-core-2.1.so.7 \
libgssapi-krb5.so.2 \
libkeyutils.so.1 \
libkrb5.so.3 \
libmount.so.1 \
libnfsidmap.so.1 \
libnss-usrfiles2 \
libsqlite3.so.0 \
libtirpc.so.3 \
netcfg \
permissions \
rpcbind \
sysuser-shadow"

inherit rpm
