SUMMARY = "Development files for XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD server development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-server-devel-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "a6f06baa1f6803c89339219ec9e5aadb95eb0494d5fb587811422b8311396ee0995af835c4f81f6aa3bc43396b0d8ee4a31ea35c29beae31542826aecc142267"

RPROVIDES:${PN} += "xrootd-server-devel"

RDEPENDS:${PN} += "xrootd-client-devel \
xrootd-libs-devel \
xrootd-server-libs"

inherit rpm
