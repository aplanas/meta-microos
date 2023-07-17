SUMMARY = "Bar program for sway"
DESCRIPTION = "Bar program for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaybar-1.8.1-3.1.aarch64.rpm"
RPM_HASH = "795d635e6abfba43b08f9188ffa7b9389e9526392d00fe8afb4e8a47ea203350092e86b3e2cb9972181aa13c09ec538c0f3ca801a134002511575397be12ce37"

RPROVIDES:${PN} += "swaybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
