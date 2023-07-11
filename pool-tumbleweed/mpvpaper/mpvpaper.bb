SUMMARY = "A video wallpaper program for wlroots based wayland compositors"
DESCRIPTION = "A video wallpaper program for wlroots based wayland compositors."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "mpvpaper-1.3-1.4.aarch64.rpm"
RPM_HASH = "33c854416392f2f64e30b5f7872f62c7aa37f814da1b7225ba79acbaf0b3b73b4aa4e9aeceed36811b5d50a7010ea4b76b3680130126703a231b22d2314bf511"

RPROVIDES:${PN} += "mpvpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6 \
libmpv.so.2 \
libwayland-client.so.0 \
mpv"

inherit rpm
