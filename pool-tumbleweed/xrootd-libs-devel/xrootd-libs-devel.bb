SUMMARY = "Development files for XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-libs-devel-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "8169671579e0246777df0c5aabda41940b3d549dde4d5f5454f5306de1eac5afb11deaaf0e0609f1a0ac7ee4f4fff04a0545f7b12a0228f17095b6503d16fc8a"

RPROVIDES:${PN} += "xrootd-libs-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
xrootd-libs"

inherit rpm
