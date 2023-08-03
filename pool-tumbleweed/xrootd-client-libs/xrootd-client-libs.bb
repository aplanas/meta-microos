SUMMARY = "Libraries used by XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-client-libs-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "60a23cbcc4ec596826ea7aaea01f55f9fc5408e25a598bac43940e6feea096b4eba8669cf17143915c7dd813d83a3d64799f44d4a8a4301553c2153a52d5a916"

RPROVIDES:${PN} += "config-xrootd-client-libs \
libXrdCl.so.3 \
libXrdFfs.so.3 \
libXrdPosix.so.3 \
libXrdPosixPreload.so.2 \
xrootd-client-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXrdUtils.so.3 \
libXrdXml.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1 \
xrootd-libs"

inherit rpm
