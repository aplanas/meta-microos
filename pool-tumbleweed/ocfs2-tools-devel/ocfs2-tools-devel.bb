SUMMARY = "Oracle Cluster File System 2 Development files"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the header files for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-devel-1.8.7-7.5.aarch64.rpm"
RPM_HASH = "8e768b49801fb73178d9d0cab3e7d2d95aba8648fca006779239e7fd170522ede7639e54bac6fa928bd2474025308927c766ea4ef8c72119b3795b962cbbcf1b"

RPROVIDES:${PN} += "ocfs2-tools-devel \
pkgconfig-o2cb \
pkgconfig-o2dlm \
pkgconfig-ocfs2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcom-err \
libcom-err-devel \
ocfs2-tools \
pkgconfig-com-err \
pkgconfig-o2cb \
pkgconfig-o2dlm"

inherit rpm
