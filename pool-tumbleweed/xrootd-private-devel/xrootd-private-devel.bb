SUMMARY = "Private XRootD development files"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains some private XRootD headers and development \
libraries. The use of these fikles is strongly discouraged. \
Backwards compatibility between versions is not guaranteed for \
them."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-private-devel-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "b853b788219533d97906f4b9096cd38e3ec467bf2a89e97723ca66e370122e5787e2c375926f4a71213fdbece7f9af849e2ba02606a6df761368f6b8a4a001e9"

RPROVIDES:${PN} += "xrootd-private-devel"

RDEPENDS:${PN} += "xrootd-libs \
xrootd-server-libs"

inherit rpm
