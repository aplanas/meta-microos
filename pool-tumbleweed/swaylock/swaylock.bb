SUMMARY = "Screen locker for Wayland"
DESCRIPTION = "swaylock is a screen locking utility for Wayland compositors."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "swaylock-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "be80b2c22e4e274bd3df96975111ca855f52b000a60312574cbdced70693ce521629209ec4b4d47fc08cb37664ce924deb921b3d1d3dc3fe99db8e354f1d4429"

RPROVIDES:${PN} += "swaylock \
swaylock(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
