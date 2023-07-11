SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkcddb-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2ce9357cab8038940e54ad7345a25f4effeec6c5da78e556e66ca482e2d8b661e83dfa5311bc548b7b8a050cbd9c6f7f8cc79f1f0fbf54044313295d0d6fc006"

RPROVIDES:${PN} += "cmake-KF5Cddb \
libkcddb-devel \
libkcddb5-devel"

RDEPENDS:${PN} += "libKF5Cddb5 \
libkcddb"

inherit rpm
