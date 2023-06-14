SUMMARY = "A video wallpaper program for wlroots based wayland compositors"
DESCRIPTION = "A video wallpaper program for wlroots based wayland compositors."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "mpvpaper-1.3-1.3.aarch64.rpm"
RPM_HASH = "1970a45df318e8617a0a86f3dba47b67068af4443aa9cfc5ac4f9a7a2f3875ac5208fb7f5420126454647ae6d8292b2fac92b2b437369b96842df3d3619153e5"

RPROVIDES:${PN} += "mpvpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6 \
libmpv.so.2 \
libwayland-client.so.0 \
mpv"

inherit rpm
