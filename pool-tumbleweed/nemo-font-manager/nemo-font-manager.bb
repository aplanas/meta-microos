SUMMARY = "Nemo extension for Font Manager"
DESCRIPTION = "This package provides integration with the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "nemo-font-manager-0.8.8-2.3.aarch64.rpm"
RPM_HASH = "cba945b6c6c4d66ec3960b970da534b2316556a0ea627e07e21cd33f38ab7eb893ecfbbd73cac2d8743355232b8edd55f8a3d8fc00ecbc4bdce0b3f13339536e"

RPROVIDES:${PN} += "nemo-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnemo-extension.so.1"

inherit rpm
