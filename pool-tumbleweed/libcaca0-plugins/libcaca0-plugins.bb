SUMMARY = "Plugins for libcaca"
DESCRIPTION = "This package contains gl and x11 plugins for caca."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca0-plugins-0.99.beta20-1.5.aarch64.rpm"
RPM_HASH = "9d1ee25903ace3862d34215963a1fce24766a9856fbfeb050b51a5ec454f36bda2b79a30aacb2dec3dcc93a06abbf7b56f40b023d123136f740e4fa195a7c875"

RPROVIDES:${PN} += "libcaca0-plugins \
libgl-plugin.so.0 \
libx11-plugin.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libcaca \
libcaca.so.0 \
libglut.so.3"

inherit rpm
