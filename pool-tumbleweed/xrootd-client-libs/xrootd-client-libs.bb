SUMMARY = "Libraries used by XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-client-libs-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "b49c05912e46c6499fd30d1c3c91c9193bf89ea6b6c8a003c6ef65263d667bb9fd3bece72b0979f0533350c8c15b89bcfcd99c1c51904e3620000863ba812045"

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
