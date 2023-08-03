SUMMARY = "Private XRootD development files"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains some private XRootD headers and development \
libraries. The use of these fikles is strongly discouraged. \
Backwards compatibility between versions is not guaranteed for \
them."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-private-devel-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "11b40de6283758a6c2e8ced7045737d74a734d690f31b62d5792217a127ceb80a476aee36caed2aa3fd1afa7264689717d33426b139cdb1bfbdc77d653afaf88"

RPROVIDES:${PN} += "xrootd-private-devel"

RDEPENDS:${PN} += "xrootd-libs \
xrootd-server-libs"

inherit rpm
