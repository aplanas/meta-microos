SUMMARY = "Oracle Cluster File System 2 tools for the native o2cb stack"
DESCRIPTION = "OCFS is the Oracle Cluster File System. \
 \
This package contains the tools to manage the native o2cb stack for the \
OCFS2 filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-o2cb-1.8.7-7.3.aarch64.rpm"
RPM_HASH = "8eeab0f47b1b33c2698463b8a7c7ae9f793ad80ab4b73367ff2cc19bdd0a4c6ba25978ad1a374931b5907aaba6052f67aeba2aebe38f31464b3bc440bbe186b1"

RPROVIDES:${PN} += "ocfs2-tools-o2cb \
ocfs2-tools-o2cb(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmap.so.4()(64bit) \
libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) \
libcom_err.so.2()(64bit) \
libdlm_lt.so.3()(64bit) \
libdlm_lt.so.3(V_4.1.0)(64bit) \
libglib-2.0.so.0()(64bit) \
ocfs2-tools"

inherit rpm
