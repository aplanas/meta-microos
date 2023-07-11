SUMMARY = "Development files for XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD server development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-server-devel-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "e5d2c30d75c0bc45a9dcc84a204e4e7bbf6ea1a65e57be0ef0e9492e90860b7a5a86e464de13acbf01bc47e98b8526d1db07e2362e00ab9197368819cddc7c51"

RPROVIDES:${PN} += "xrootd-server-devel"

RDEPENDS:${PN} += "xrootd-client-devel \
xrootd-libs-devel \
xrootd-server-libs"

inherit rpm
