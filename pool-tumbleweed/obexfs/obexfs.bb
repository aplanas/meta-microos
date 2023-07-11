SUMMARY = "FUSE based filesystem using ObexFTP"
DESCRIPTION = "ObexFS is a fuse (FUSE-based filesystem) using obexftp (ObexFTP) to \
access files on mobile phones."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "obexfs-0.12-3.7.aarch64.rpm"
RPM_HASH = "ef306750c45c3ded35cb53929f265956782a839c8fd9cebac1ed53ba7890a8846374f129454c9dee05a4ea446502bd45a52587745754160aa4a5d5b4b65b8c23"

RPROVIDES:${PN} += "obexfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libobexftp.so.0"

inherit rpm
