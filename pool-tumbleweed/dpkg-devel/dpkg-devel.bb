SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-devel-1.21.8-2.2.aarch64.rpm"
RPM_HASH = "5f1ae0dbf8f394ae9915978fc4a7f1cf007d1cbb85815965341a081d802b580008b658631e1fe026c004a67821bbddfc7bada8a27a4cd1173aa8184b03cc6fab"

RPROVIDES:${PN} += "deb-devel \
dpkg-devel \
pkgconfig-libdpkg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dpkg \
libmd-devel"

inherit rpm
