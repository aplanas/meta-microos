SUMMARY = "A collection of utilities and examples to exercise VA-API"
DESCRIPTION = "libva-utils is a collection of utilities and examples to exercise \
VA-API in accordance with the libva project. \
A driver implementation is necessary to properly operate."
LICENSE = "EPL-1.0 & MIT"

PV = "2.19.0"

RPM_NAME = "libva-utils-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "26c372e29796264b3eaf1554454c6c69c7f08f23026df0676e7d20b25047f7a508273fbaca2b6b5db0c881fd021f637abaf9c3818b3b8a430abe80aafefc4a76"

RPROVIDES:${PN} += "libva-utils \
vaapi-tools \
vaapi-wayland-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
