SUMMARY = "Oracle Cluster File System 2 Core Tools"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the core user-space tools needed for creating and \
managing the file system."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-1.8.7-7.5.aarch64.rpm"
RPM_HASH = "8f4c39dfa878809febe5af0f16135b841130a4c3f604c490c37f21ad896c34296fddb3decc64a4aa4155f3695497a01257b38b2dca47e579b907b4fa8472f2e1"

RPROVIDES:${PN} += "ocfs2-tools"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
e2fsprogs \
fillup \
glib2 \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcmap.so.4 \
libcom-err.so.2 \
libdlm \
libdlm-lt.so.3 \
libglib-2.0.so.0 \
libreadline.so.8 \
libuuid.so.1 \
modutils \
net-tools"

inherit rpm
