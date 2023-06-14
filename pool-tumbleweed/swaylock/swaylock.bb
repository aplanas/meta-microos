SUMMARY = "Screen locker for Wayland"
DESCRIPTION = "swaylock is a screen locking utility for Wayland compositors."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "swaylock-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "be80b2c22e4e274bd3df96975111ca855f52b000a60312574cbdced70693ce521629209ec4b4d47fc08cb37664ce924deb921b3d1d3dc3fe99db8e354f1d4429"

RPROVIDES:${PN} += "swaylock"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
