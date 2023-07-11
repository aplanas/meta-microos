SUMMARY = "Idle management daemon for Wayland"
DESCRIPTION = "sway's idle management daemon. It is compatible with any Wayland compositor which implements the KDE idle protocol."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "15dd61886a3401d9b6c0962eaf6158c3ca0ded10a87309a8425bfb259af075279db0eb3ea45dd54d131cc9f2aeed32a95116f0f949d21620963571330a05bf54"

RPROVIDES:${PN} += "swayidle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
