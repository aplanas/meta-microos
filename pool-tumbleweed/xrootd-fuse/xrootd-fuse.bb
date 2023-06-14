SUMMARY = "FUSE-based XRootD filesystem mount"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the FUSE (file system in user space) \
XRootD mount tool."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-fuse-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "04157d15ed6fc773e16b60251709e772f0fd1e8b8b87bf1858900e72eb3ca35b1dd46ddaa82d84e555b1959a05de3a669c8593742da8a2b7f429302e83d091f3"

RPROVIDES:${PN} += "xrootd-fuse"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libXrdFfs.so.3 \
libXrdPosix.so.3 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
xrootd-client \
xrootd-libs"

inherit rpm
