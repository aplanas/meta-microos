SUMMARY = "Developer documentation for the XRootD libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the API documentation of the XRootD \
libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-doc-5.5.5-1.1.noarch.rpm"
RPM_HASH = "955d0fc81073d9f16c81350eae64acc1913065eaf7ec95704cf84bef8e5e058fc09740e6e2202ae3b6fd567e1749d82d14fe679d9b2dd8fa6a492a7ee0c4e7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xrootd-doc"

RDEPENDS:${PN} += ""

inherit rpm
