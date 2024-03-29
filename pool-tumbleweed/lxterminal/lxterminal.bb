SUMMARY = "Lightweight LXDE Terminal"
DESCRIPTION = "LXTerminal is a lightweight Terminal Emulator. \
This package even if DE independent is part \
of the LXDE project."
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "lxterminal-0.4.0-1.11.aarch64.rpm"
RPM_HASH = "7671e4fd8fd106b0d603ad0f87fd678147cd4465c064ddec791ad203911cf9e2f9ab94e54e409cb306fcc9b0491e4ae613a53bbb40900bd3622c5c34889c1a0b"

RPROVIDES:${PN} += "lxterminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
