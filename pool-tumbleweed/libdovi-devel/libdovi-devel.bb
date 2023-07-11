SUMMARY = "Development libraries for libdovi"
DESCRIPTION = "The libdovi-devel package contains C header files for \
developing applications that use libdovi."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "libdovi-devel-3.1.2-2.2.aarch64.rpm"
RPM_HASH = "1cbbc7b2f343abd7038ddd5d46fcd505180068157d7e517b1aa6e553ee5e35a59e8576947b77b8a9b62d63c7ee4692566da1a838cadacbf89f20e491138dec44"

RPROVIDES:${PN} += "libdovi-devel \
pkgconfig-dovi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdovi3"

inherit rpm
