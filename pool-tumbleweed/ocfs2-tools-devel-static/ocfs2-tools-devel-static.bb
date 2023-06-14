SUMMARY = "Oracle Cluster File System 2 static libraries"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the static libraries for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-devel-static-1.8.7-7.3.aarch64.rpm"
RPM_HASH = "c78edfac2e5d22dbc75c1e020b54725d523012c155528672d586bf47e3a53a8449550c02a73f85a7e335204c4b78297978ac2150fbb4402b182a71c442d98641"

RPROVIDES:${PN} += "ocfs2-tools-devel-static"

RDEPENDS:${PN} += "libcom-err \
libcom-err-devel \
ocfs2-tools"

inherit rpm
