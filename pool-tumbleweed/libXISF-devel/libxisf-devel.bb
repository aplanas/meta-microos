SUMMARY = "Development files for libXISF"
DESCRIPTION = "This package contains all the needed development files to use libXISF."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.8"

RPM_NAME = "libXISF-devel-0.2.8-1.1.aarch64.rpm"
RPM_HASH = "43956213b74bb89d75e32e4a29e5911e2ec911568b3173198dc67ac174641673c28c1de322ddbf943c6be184371c1fba55a5211ae5f23f1736b7e97c7e54548f"

RPROVIDES:${PN} += "libXISF-devel \
pkgconfig-libxisf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXISF0"

inherit rpm
