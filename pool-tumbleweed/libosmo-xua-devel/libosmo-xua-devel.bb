SUMMARY = "Development files for the Osmocom M2UA library"
DESCRIPTION = "M2UA provides an SCTP adaptation layer for MTP level 2 user messages \
and service interface across an IP network. \
 \
This subpackage contains the development files for the Osmocom M2UA \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-xua-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "54019029b7d42ad57bd5e9be80cca4e5b26d86d150313968548b9049db72c91167a7076b61dbce82689f17a41ea4aa65af7657133e7985f02fb2d6e497241b06"

RPROVIDES:${PN} += "libosmo-xua-devel \
pkgconfig-libosmo-xua"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sigtran-devel \
libosmo-xua-1-7-0"

inherit rpm
