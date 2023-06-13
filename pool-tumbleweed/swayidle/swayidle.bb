SUMMARY = "Idle management daemon for Wayland"
DESCRIPTION = "sway's idle management daemon. It is compatible with any Wayland compositor which implements the KDE idle protocol."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "63be4b3b084edd07c666387ddeb58be904d3f8e72061dd1ccc9e89847a211b9aa8159d83386c9ba6123c6c97b10b5a94729b342f1ac53f2a3e57639936dd2a12"

RPROVIDES:${PN} += "swayidle \
swayidle(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
