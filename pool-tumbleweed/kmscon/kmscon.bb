SUMMARY = "Linux KMS/DRM based virtual Console Emulator"
DESCRIPTION = "Kmscon is a simple terminal emulator based on linux kernel mode setting (KMS). \
It is an attempt to replace the in-kernel VT implementation with a userspace \
console."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "kmscon-9.0.0-1.4.aarch64.rpm"
RPM_HASH = "a910c3ce37a422ad13beca8fa37f7f31495dea8904c56ec6eb0e8089589fc34673a5e9079cf06790b71b616f01faa0a725048a4ba050cdd0e4124f6d61199ee2"

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
