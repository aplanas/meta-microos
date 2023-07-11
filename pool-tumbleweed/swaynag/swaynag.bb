SUMMARY = "Displays warning and error messages in sway"
DESCRIPTION = "Displays warning and error messages in sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaynag-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "183f248cf54e70f96bfa003c706ae9b77a17cacb6825a9e90903d180555c4bfae5b66857a945287730b546eda7ba355c2319d5987f70eccc4e02f90015fc5bb2"

RPROVIDES:${PN} += "swaynag"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
