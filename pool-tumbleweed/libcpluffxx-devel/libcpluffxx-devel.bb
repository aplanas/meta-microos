SUMMARY = "Development files for libcpluffxx"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluffxx."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluffxx-devel-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "f6d296544aaafd3e52354ffc4f564a7884c20d877f6ca11c83058d6fdc5361b5dd7a0410e5ba5216b0a4c54e5f30b31b26fce62e3b1d4f254fef3ebf1ac69fea"

RPROVIDES:${PN} += "libcpluffxx-devel \
pkgconfig-libcpluffxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluffxx0 \
pkgconfig-libcpluff"

inherit rpm
