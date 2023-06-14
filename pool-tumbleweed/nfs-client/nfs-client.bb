SUMMARY = "Support Utilities for NFS"
DESCRIPTION = "This package contains common NFS utilities which are needed for client \
and kernel based server."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.3"

RPM_NAME = "nfs-client-2.6.3-39.1.aarch64.rpm"
RPM_HASH = "e033a304f0ddf509a1236b808db1764e8cf77d35b9e89b4b0cbbd6a669bc5ec85ff04ba1862ba6a450ca54cc5d73c3be807a8d85bfee5187c22371f3a4132033"

RPROVIDES:${PN} += "config-nfs-client \
group-statd \
nfs-client \
user-statd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
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
