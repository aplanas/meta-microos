SUMMARY = "Private XRootD development files"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains some private XRootD headers and development \
libraries. The use of these fikles is strongly discouraged. \
Backwards compatibility between versions is not guaranteed for \
them."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-private-devel-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "76a71762e5b1af1998cb4cd02872350df1805270429b68b57c3557b65575d5a9430ace8b9aa26e9cca0cc27c0a944cb20f0e278faa4b7fb50dcd41ae7a689f24"

RPROVIDES:${PN} += "xrootd-private-devel"

RDEPENDS:${PN} += "xrootd-libs \
xrootd-server-libs"

inherit rpm
