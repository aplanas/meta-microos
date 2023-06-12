SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-devel-1.21.8-2.1.aarch64.rpm"
RPM_HASH = "e7c07093fb828f37d65deee77767d4c6ca6393c385a7dd589eb5ab88b80dae78e12cbb38a38dd27914b58ea5cf89c7536c961b2a19b1b6df0cabc04d9701a1be"

RPROVIDES:${PN} += "deb-devel \
dpkg-devel \
dpkg-devel(aarch-64) \
pkgconfig(libdpkg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
dpkg \
libmd-devel"

inherit rpm
