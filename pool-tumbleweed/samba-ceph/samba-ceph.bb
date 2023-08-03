SUMMARY = "Ceph specific add-ons for Samba"
DESCRIPTION = "The Ceph VFS module for Samba allows shares to be backed by the Ceph \
distributed file system. A Ceph CTDB lock helper binary is included so \
that RADOS locks can be used for CTDB split-brain avoidance."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-ceph-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "802010f7daedd3ad43da267d771b08c4869e4e5eb0aee7016d2a2935db14b8bcaab3f831793b173916e549b6b9e02c368e73bd97d986f20181c06ffbfc1c0701"

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
