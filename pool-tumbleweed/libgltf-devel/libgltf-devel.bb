SUMMARY = "C++ Library for rendering OpenGL models stored in glTF format"
DESCRIPTION = "libgltf is a library for rendering OpenGL models stored in glTF format"
LICENSE = "MPL-2.0"

PV = "0.1.0"

RPM_NAME = "libgltf-devel-0.1.0-2.25.aarch64.rpm"
RPM_HASH = "f402a2571315fdcf5dcb0e759cd85422279d7503fcc740072a162fe08aa3ebdb69ba133d63306e8f94e9d138dfb7faca58bddd2bc1e4bb7783f9ba222a9db46b"

RPROVIDES:${PN} += "libgltf-devel \
libgltf-devel(aarch-64) \
pkgconfig(libgltf-0.1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glm-devel \
libgltf-0_1-1 \
libstdc++-devel \
pkgconfig(epoxy)"

inherit rpm
