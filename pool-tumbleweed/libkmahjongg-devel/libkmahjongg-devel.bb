SUMMARY = "Library for Mahjongg tiles: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop games that uses Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkmahjongg-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c20919eb521e0024f0e9def050afabf81a838cbad4558d2ccef7106ad6530b338e3fce71c6e313376525de91927890a2e7488a234d9c0dba6ef4591a3fe950f6"

RPROVIDES:${PN} += "cmake-KF5KMahjongglib \
libkmahjongg-devel \
libkmahjongg-kf5-devel"

RDEPENDS:${PN} += "libKF5KMahjongglib5"

inherit rpm
