SUMMARY = "C++ Library for rendering OpenGL models stored in glTF format"
DESCRIPTION = "libgltf is a library for rendering OpenGL models stored in glTF format"
LICENSE = "MPL-2.0"

PV = "0.1.0"

RPM_NAME = "libgltf-devel-0.1.0-2.26.aarch64.rpm"
RPM_HASH = "7129887b99e3d29a7e68b4f8f1580538f339715f3358bddd839327c41de815148fca1f83524668cc0d4c07f551384f02fec02961cd45d5feb2a4a1b4fdc1d778"

RPROVIDES:${PN} += "libgltf-devel \
pkgconfig-libgltf-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glm-devel \
libgltf-0-1-1 \
libstdc++-devel \
pkgconfig-epoxy"

inherit rpm
