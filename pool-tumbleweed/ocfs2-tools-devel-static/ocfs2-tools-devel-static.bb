SUMMARY = "Oracle Cluster File System 2 static libraries"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the static libraries for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-devel-static-1.8.7-7.5.aarch64.rpm"
RPM_HASH = "c69b88d3613aefa2522a749090b218da374d2fdbfa280684f060c386a1869f94eedd86ea26f44d5fce7fca71c3198f516e2690aae7313a63702d92f9f96cc7a7"

RPROVIDES:${PN} += "ocfs2-tools-devel-static"

RDEPENDS:${PN} += "libcom-err \
libcom-err-devel \
ocfs2-tools"

inherit rpm
