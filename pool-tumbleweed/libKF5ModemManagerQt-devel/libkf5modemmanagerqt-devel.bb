SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5ModemManagerQt-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "3a540477ca4f90b284da13ca1d255c9c0a75b3c475754418b162767ebb34ed62ddc90d6344193dc8837a65ac2f4f8811b34fd5398f11ec1a9c6756b59b229a24"

RPROVIDES:${PN} += "cmake(KF5ModemManagerQt) \
libKF5ModemManagerQt-devel \
libKF5ModemManagerQt-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5DBus) \
libKF5ModemManagerQt6 \
pkgconfig(ModemManager)"

inherit rpm
