SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
DESCRIPTION = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
LICENSE = "ISC"

PV = "0.14.2"

RPM_NAME = "wob-0.14.2-1.3.aarch64.rpm"
RPM_HASH = "d77769807362bd4c3611725aedcf87534e1cfbf6849256893843bc37dcfef5f4347f2dbb2591a1f56e3a43bb1632bdd1397c77dff2f63328d0ee39f808c302db"

RPROVIDES:${PN} += "wob"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinih.so.0 \
libseccomp.so.2 \
libwayland-client.so.0"

inherit rpm
