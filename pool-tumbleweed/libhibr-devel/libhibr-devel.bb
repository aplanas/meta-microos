SUMMARY = "Development files for libhibr"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhibr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-devel-20210421-3.5.aarch64.rpm"
RPM_HASH = "87804c2803ced5a950de7642e9c1f70d1effc6bb55dc3dd0b833a3684ad9c34ac8ac0579845e8b31750214c87b7eae38bf00087bb7d08336c4d24e99315dae6a"

RPROVIDES:${PN} += "libhibr-devel \
libhibr-devel(aarch-64) \
pkgconfig(libhibr)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libhibr1"

inherit rpm
