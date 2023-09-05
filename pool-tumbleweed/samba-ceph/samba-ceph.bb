SUMMARY = "Ceph specific add-ons for Samba"
DESCRIPTION = "The Ceph VFS module for Samba allows shares to be backed by the Ceph \
distributed file system. A Ceph CTDB lock helper binary is included so \
that RADOS locks can be used for CTDB split-brain avoidance."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-ceph-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "6f76ff874bd47e062ec9858ffffda74c382d50cc782f9afe9c68647e5422d5c87baa512e3084bc84b5ccbf7b39d09f45fa64029e9ef9794d7467bf560a0c278e"

RPROVIDES:${PN} += "samba-ceph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libgenrand-samba4.so \
librados.so.2 \
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
