SUMMARY = "Libraries used by XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-client-libs-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "c08bf2fc0edc6dadebc648c5befe5571fa6db1766746c4f08e8c1416afe7501ffcceeb5a974b4c5b7a9fe3915e71464f5f69e3dcb98851914d87eea7eb434ec1"

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
