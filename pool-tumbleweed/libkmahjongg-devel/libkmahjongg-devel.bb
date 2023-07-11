SUMMARY = "Library for Mahjongg tiles: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop games that uses Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkmahjongg-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2290732195ba2c47da654f7c200ba4352a910235040b51a5318413806fda2c4f0ac51cbbfa502c00ce3bae91a5514a3790445e3dd727c2f3f89de5d68a1bad35"

RPROVIDES:${PN} += "cmake-KF5KMahjongglib \
libkmahjongg-devel \
libkmahjongg-kf5-devel"

RDEPENDS:${PN} += "libKF5KMahjongglib5"

inherit rpm
