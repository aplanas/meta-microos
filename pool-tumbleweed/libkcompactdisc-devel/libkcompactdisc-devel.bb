SUMMARY = "Development files for the KDE CD drive library"
DESCRIPTION = "This package contains the development headers for libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkcompactdisc-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2594b1c6db1a6d6a19d242e3ff70b39f1de0370df780493f4788f933c6f153c5f23623bc8338bdf5f1b43bb6ddbd631a21ea9e9ac636f152dc081cecadb1b98f"

RPROVIDES:${PN} += "cmake-KF5CompactDisc \
libkcompactdisc-devel"

RDEPENDS:${PN} += "libKF5CompactDisc5"

inherit rpm
