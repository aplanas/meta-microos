SUMMARY = "Ceph specific add-ons for Samba"
DESCRIPTION = "The Ceph VFS module for Samba allows shares to be backed by the Ceph \
distributed file system. A Ceph CTDB lock helper binary is included so \
that RADOS locks can be used for CTDB split-brain avoidance."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ceph-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "cb93045ffae071bd69fd402066d7f3c311cc36f4bcf5739f83d91c9c4c3b62fc4b326b0656736b0ca511910124059f3821e12ce0d6217885322fb23441e4822e"

RPROVIDES:${PN} += "samba-ceph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libgenrand-samba4.so \
librados.so.2 \
libreplace-samba4.so \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsmbconf.so.0 \
libsmbd-base-samba4.so \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0 \
samba"

inherit rpm
