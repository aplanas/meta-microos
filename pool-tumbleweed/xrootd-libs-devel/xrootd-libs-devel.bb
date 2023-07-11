SUMMARY = "Development files for XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-libs-devel-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "12fa3d35c7ff0400c62f178217c66359e3e22e94228378ea0e30b7de2217d806c80a50a5986a9e24f73fbad7cd77e711337f161b04e486148caea24282317127"

RPROVIDES:${PN} += "xrootd-libs-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
xrootd-libs"

inherit rpm
