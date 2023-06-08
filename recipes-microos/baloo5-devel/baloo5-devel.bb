SUMMARY = "Development package for baloo5"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "4662158835a0f70b95004a8f822c1cc75ae0147336e6a86714092b2583a3d0e2e985e1c75f69d8697fa0030080c74550ac30171afa92b8b9b4459da6dd3d3cdc"

RPROVIDES:${PN} += "baloo5-devel baloo5-devel(aarch-64) cmake(KF5Baloo) pkgconfig(Baloo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(KF5CoreAddons) cmake(KF5FileMetaData) cmake(Qt5Core) libKF5Baloo5 libKF5BalooEngine5 lmdb-devel pkgconfig(Qt5Core)"

inherit rpm
