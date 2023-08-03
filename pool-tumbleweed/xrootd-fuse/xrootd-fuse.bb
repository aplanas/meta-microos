SUMMARY = "FUSE-based XRootD filesystem mount"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the FUSE (file system in user space) \
XRootD mount tool."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-fuse-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "3e41e4ed83ba761cb30021cae9648635fe3eb772bfcb409728442284a6705f494df12baf726f3e4c5ab92e1049bbe7467d66718f59744d9d36c8cf6e10ec1798"

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
