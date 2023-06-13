SUMMARY = "Oracle Cluster File System 2 Core Tools"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the core user-space tools needed for creating and \
managing the file system."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-1.8.7-7.3.aarch64.rpm"
RPM_HASH = "c261690e52f4430cc18fb8258ece7509b8d6eb5da42637bdb448d32d7914146473713dbe921565b47609a6baa03d2d717efbb113702918d3fa535ad428175525"

RPROVIDES:${PN} += "ocfs2-tools \
ocfs2-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
e2fsprogs \
fillup \
glib2 \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libc.so.6()(64bit) \
libcmap.so.4()(64bit) \
libcom_err.so.2()(64bit) \
libdlm \
libdlm_lt.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libuuid.so.1()(64bit) \
modutils \
net-tools"

inherit rpm
