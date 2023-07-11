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

RPM_NAME = "libgfchangelog0-11.0-3.1.aarch64.rpm"
RPM_HASH = "3c6a3c4f9f44af2fa4059fd71e2e2a603294a76196532ea5ea1e62d15ad2581a86ee7b22c6f3526b2d24a3239b7b6337636aab69f2f7b5345d54e08057db3694"

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
