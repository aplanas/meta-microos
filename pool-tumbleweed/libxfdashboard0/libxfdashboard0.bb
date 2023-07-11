SUMMARY = "Xfdashboard library"
DESCRIPTION = "A library providing authenticators for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libxfdashboard0-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "97a19396e9b6e87ca9ca08f9c0b0e7e67e34751435d6d4deaccd987ad539e13868d0bfa464abe7423048396cd113ae7220ea1e70bd1e04a28007fe4e16587826"

RPROVIDES:${PN} += "libxfdashboard.so.0 \
libxfdashboard0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXinerama.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwnck-3.so.0 \
libxfce4util.so.7"

inherit rpm
