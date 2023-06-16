SUMMARY = "Oracle Cluster File System 2 tools for the native o2cb stack"
DESCRIPTION = "OCFS is the Oracle Cluster File System. \
 \
This package contains the tools to manage the native o2cb stack for the \
OCFS2 filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-o2cb-1.8.7-7.3.aarch64.rpm"
RPM_HASH = "8eeab0f47b1b33c2698463b8a7c7ae9f793ad80ab4b73367ff2cc19bdd0a4c6ba25978ad1a374931b5907aaba6052f67aeba2aebe38f31464b3bc440bbe186b1"

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
