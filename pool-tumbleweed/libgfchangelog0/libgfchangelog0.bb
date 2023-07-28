SUMMARY = "GlusterFS volume changelog translator library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
The goal of this volume translator is to capture changes performed on \
a GlusterFS volume. The translator needs to be loaded on the server \
(bricks) and captures changes in a plain text file inside a \
configured directory path (controlled by the 'changelog-dir' \
directive)."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfchangelog0-11.0-4.1.aarch64.rpm"
RPM_HASH = "64d3c3c1451cb0ba480a095c5e65b96f5cb1560dddbbebaca71ae1862efcaf958305b411f8ddbf420a6e9bd7cd666dc4dd232cd254be4566fdeceef0b8d315df"

RPROVIDES:${PN} += "libgfchangelog.so.0 \
libgfchangelog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfrpc.so.0 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
