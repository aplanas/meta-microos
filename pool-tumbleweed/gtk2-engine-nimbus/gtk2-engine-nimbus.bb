SUMMARY = "Nimbus GTK Theme Engine"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0+"

PV = "0.1.7"

RPM_NAME = "gtk2-engine-nimbus-0.1.7-13.28.aarch64.rpm"
RPM_HASH = "260f21e0fa0d60c7edb886c04114cabf9a164b9ed833de1ece7a921d59c87017245881070452f411384f7cf8eadbed600d9bf9b9cec452f41d05daeed9996a83"

RPROVIDES:${PN} += "gtk2-engine-nimbus \
libnimbus.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
