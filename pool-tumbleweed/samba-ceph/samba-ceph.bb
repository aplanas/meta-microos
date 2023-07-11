SUMMARY = "Ceph specific add-ons for Samba"
DESCRIPTION = "The Ceph VFS module for Samba allows shares to be backed by the Ceph \
distributed file system. A Ceph CTDB lock helper binary is included so \
that RADOS locks can be used for CTDB split-brain avoidance."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-ceph-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "5d562b35318a31e522bd15b28e6d9605670ff6828fd9e700c53e105119186df7c9d88fb1b6695c609bdfbfff24e925d1efe52da171beecfd57e84ea19a26365c"

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
