SUMMARY = "A cross-platform C++ library for network and low-level I/O programming"
DESCRIPTION = "Asio is a cross-platform C++ library for network and low-level I/O \
programming that provides developers with a consistent asynchronous I/O \
model using a modern C++ approach."
LICENSE = "BSD-3-Clause"

PV = "1.28.0"

RPM_NAME = "asio-devel-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "38e924aa9ce1cf1e850b734bebe934f6e85981dc318bd59dcdc4ef888c8f18d9e2e4e73d56ab80e22f9b5e52c23aa42eea08ea6b08e523aa2b2f725c06fb447c"

RPROVIDES:${PN} += "asio-devel \
pkgconfig-asio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
openssl-devel"

inherit rpm
