SUMMARY = "A cross-platform C++ library for network and low-level I/O programming"
DESCRIPTION = "Asio is a cross-platform C++ library for network and low-level I/O \
programming that provides developers with a consistent asynchronous I/O \
model using a modern C++ approach."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "asio-devel-1.26.0-1.1.aarch64.rpm"
RPM_HASH = "a917bb727dfc4c37b9ccbb98f86aced98a9f563f89c92b867c0b3a3976239bcfa16ecb2452729e73a909ab51b6f7c2a2084efa7e6ac742503139cf788cbbdb91"

RPROVIDES:${PN} += "asio-devel \
asio-devel(aarch-64) \
pkgconfig(asio)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
openssl-devel"

inherit rpm
