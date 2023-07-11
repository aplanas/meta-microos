SUMMARY = "Development files for QCSXCAD"
DESCRIPTION = "A Qt-GUI for the CSXCAD library. \
 \
This package contains libraries and header files for developing \
applications that use QCSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "QCSXCAD-devel-0.6.2-5.6.aarch64.rpm"
RPM_HASH = "d2216a445ae4826783dd2ddd8f85d5421b5a3bfdfe4be2736a65118f2149505904284aebedcb41bbab8416a09cf3ea176ecff7e5d69e2a8ad681f541f08cc9f9"

RPROVIDES:${PN} += "QCSXCAD-devel"

RDEPENDS:${PN} += "libQCSXCAD0"

inherit rpm
