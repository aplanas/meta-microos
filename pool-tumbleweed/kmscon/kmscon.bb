SUMMARY = "Linux KMS/DRM based virtual Console Emulator"
DESCRIPTION = "Kmscon is a simple terminal emulator based on linux kernel mode setting (KMS). \
It is an attempt to replace the in-kernel VT implementation with a userspace \
console."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "kmscon-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "6bbbe20fa92b10a38e551731d8eb19caabc2d3a10d68733e8f926e15489fff47c85cd03c172a4bc87cee300ee317e242de4ecee68a52b72c17c499e7901d68da"

RPROVIDES:${PN} += "kmscon \
kmscon-service"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpixman-1.so.0 \
libsystemd.so.0 \
libtsm.so.4 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
