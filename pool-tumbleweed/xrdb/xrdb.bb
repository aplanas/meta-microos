SUMMARY = "X server resource database utility"
DESCRIPTION = "Xrdb is used to get or set the contents of the RESOURCE_MANAGER property \
on the root window of screen 0, or the SCREEN_RESOURCES property on the \
root window of any or all screens, or everything combined."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "xrdb-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "9f3339c2b8ecd15a6aaa478a2c51890f20f94da4a6a2f83d3402bb1a7ac400ae11f9da01de32c11e350f9c839a11473ab5df9686c37c5ab8a08d2dd949ee8ac6"

RPROVIDES:${PN} += "xrdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
