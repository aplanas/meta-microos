SUMMARY = "A collection of utilities and examples to exercise VA-API"
DESCRIPTION = "libva-utils is a collection of utilities and examples to exercise \
VA-API in accordance with the libva project. \
A driver implementation is necessary to properly operate."
LICENSE = "EPL-1.0 & MIT"

PV = "2.18.2"

RPM_NAME = "libva-utils-2.18.2-1.1.aarch64.rpm"
RPM_HASH = "fce4153ba6bd87db8267abb9d276e39446fcb19f605bcb54cf6639630fff94e65f01887f66db57f8f7f76eaa6dd8c871158bea23fd76e10c8a1181e5c7739d42"

RPROVIDES:${PN} += "libva-utils \
libva-utils(aarch-64) \
vaapi-tools \
vaapi-wayland-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libva-drm.so.2()(64bit) \
libva-wayland.so.2()(64bit) \
libva-x11.so.2()(64bit) \
libva.so.2()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
