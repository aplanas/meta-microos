SUMMARY = "Oracle Cluster File System 2 tools for the native o2cb stack"
DESCRIPTION = "OCFS is the Oracle Cluster File System. \
 \
This package contains the tools to manage the native o2cb stack for the \
OCFS2 filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-o2cb-1.8.7-7.5.aarch64.rpm"
RPM_HASH = "24ffc86f3a606cf1fa80acb04c97da81babdf87add925619d70b4f01dc0aa2484636714d7729f18a2f27afaddd9d993e670fcede5bccf6693b3f171e9f21becc"

RPROVIDES:${PN} += "ocfs2-tools-o2cb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcmap.so.4 \
libcom-err.so.2 \
libdlm-lt.so.3 \
libglib-2.0.so.0 \
ocfs2-tools"

inherit rpm
