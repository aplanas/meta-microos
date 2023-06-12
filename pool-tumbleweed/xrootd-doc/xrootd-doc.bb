SUMMARY = "Developer documentation for the XRootD libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the API documentation of the XRootD \
libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-doc-5.5.4-1.1.noarch.rpm"
RPM_HASH = "a884b8aace7b5c874c87701374a01cdc54c4d8aa7717bd4a7e7605e92095e86b22af069d73657557704107fd50fe0403a2adb2a39e9f122ea7347017fd5f276f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xrootd-doc"
RDEPENDS:${PN} += ""

inherit rpm
