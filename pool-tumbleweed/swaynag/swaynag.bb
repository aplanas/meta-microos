SUMMARY = "Displays warning and error messages in sway"
DESCRIPTION = "Displays warning and error messages in sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaynag-1.8.1-3.1.aarch64.rpm"
RPM_HASH = "73a3ab19b9c7c53855cbb54364920b5c212d9473329f5164f66899ce456c461555b9488acfae389d4eab0b6cc4241ba08ab2a45c1820c8bc195cd3bcf4829d00"

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
