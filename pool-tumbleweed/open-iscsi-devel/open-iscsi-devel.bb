SUMMARY = "The iSCSI User-level Library Development Library and Include files"
DESCRIPTION = "This development package contains the open-iscsi user-level library \
include files and documentation. These are used to compile against \
the libopeniscsiusr library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.8"

RPM_NAME = "open-iscsi-devel-2.1.8-99.1.aarch64.rpm"
RPM_HASH = "69417759615590e9be93b7d9af6f8f74dbf7be2077e4351493f2d5f4678d354d0fe9ce04ec7e521f554296e6db9b24d825af4ca15e6e6d1ce72691ec885fa722"

RPROVIDES:${PN} += "open-iscsi-devel \
open-iscsi-devel(aarch-64) \
pkgconfig(libopeniscsiusr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopeniscsiusr0 \
open-iscsi"

inherit rpm
