SUMMARY = "FUSE-based XRootD filesystem mount"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the FUSE (file system in user space) \
XRootD mount tool."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-fuse-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "50bae6a17f642ac3b3a8397bf4a436461f7c39d17a2e155495efabef9e4f44deea385e62df1443b08df8ac00c7c14fc94193f0927f1d6c83f5abfbff4cc2f3d6"

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
