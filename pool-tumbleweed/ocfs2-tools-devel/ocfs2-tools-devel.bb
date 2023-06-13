SUMMARY = "Oracle Cluster File System 2 Development files"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the header files for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.7"

RPM_NAME = "ocfs2-tools-devel-1.8.7-7.3.aarch64.rpm"
RPM_HASH = "1fbcf577fbe03ad7766ae61b4afc503096e39190076268ef3159a483ab26d9cbbee820eb7d44a33389281c4b49be1aa052cae95b4b52cf378f6802fef93312fc"

RPROVIDES:${PN} += "ocfs2-tools-devel \
ocfs2-tools-devel(aarch-64) \
pkgconfig(o2cb) \
pkgconfig(o2dlm) \
pkgconfig(ocfs2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcom_err \
libcom_err-devel \
ocfs2-tools \
pkgconfig(com_err) \
pkgconfig(o2cb) \
pkgconfig(o2dlm)"

inherit rpm
