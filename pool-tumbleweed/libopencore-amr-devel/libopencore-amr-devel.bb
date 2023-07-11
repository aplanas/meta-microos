SUMMARY = "Devel and header files for AMR"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband and Wideband speech codec. \
Developer Package."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amr-devel-0.1.6-1.4.aarch64.rpm"
RPM_HASH = "2bc26bf00ecf31687c1f80e8bf83f5bddd9d0de53f7c9459ea0f52c0120439b4059dc305de55f06be380b3f0c6092971dade86ea02e87f385f66943e97f641a1"

RPROVIDES:${PN} += "libopencore-amr-devel \
pkgconfig-opencore-amrnb \
pkgconfig-opencore-amrwb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencore-amrnb0 \
libopencore-amrwb0"

inherit rpm
