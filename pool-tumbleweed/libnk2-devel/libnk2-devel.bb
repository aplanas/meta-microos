SUMMARY = "Development files for libnk2"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnk2."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-devel-20221122-3.5.aarch64.rpm"
RPM_HASH = "50dff127190e3d6c66685d514a490fb32c86f9243159950829f8dec7d843223dcac73bc11a8231d91c6edfb3f6751a4c35bdef905c66144e1291d32bb174a055"

RPROVIDES:${PN} += "libnk2-devel \
pkgconfig-libnk2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnk2-1"

inherit rpm
