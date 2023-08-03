SUMMARY = "Developer documentation for the XRootD libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the API documentation of the XRootD \
libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-doc-5.6.1-1.1.noarch.rpm"
RPM_HASH = "48537de27bef28dfc7d999e32ff1539594495fde6c4b4c1cf2b8859f99b4985714c6354e477d8400e98e2627c17c2dc497d14a8722513d0bfaaca352af71b82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xrootd-doc"

RDEPENDS:${PN} += ""

inherit rpm
