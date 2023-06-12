SUMMARY = "Library for Mahjongg tiles: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop games that uses Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkmahjongg-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5ae42f8a66539d27c9a86a07e27a1769c56dad6fa53a2fc4ef29699ee0e7729b55e0e43706cf83770bbdf296d62c41c4661785d7228db1ecd368397711f5cf95"

RPROVIDES:${PN} += "cmake(KF5KMahjongglib) \
libkmahjongg-devel \
libkmahjongg-devel(aarch-64) \
libkmahjongg-kf5-devel"
RDEPENDS:${PN} += "libKF5KMahjongglib5"

inherit rpm
