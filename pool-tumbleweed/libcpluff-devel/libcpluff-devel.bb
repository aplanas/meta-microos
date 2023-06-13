SUMMARY = "Development files for libcpluff"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluff."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluff-devel-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "83b8b09f154e57968b7315e2f0faf05516afe4786330bcd53c44894e4e42a6832196b4b5976797b4971e6a8e2dcd51e7084e812e814ab4b406b8c454ca86b4bf"

RPROVIDES:${PN} += "libcpluff-devel \
libcpluff-devel(aarch-64) \
pkgconfig(libcpluff)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluff0"

inherit rpm
