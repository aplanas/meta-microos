SUMMARY = "Nemo extension for Font Manager"
DESCRIPTION = "This package provides integration with the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "nemo-font-manager-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "e69b7e059fb4bbae7db9c158a90bab1886a22934d3890a869e14385225540fe4093db0dfd7df731012fc6159dd89dbd01a0c8735a9f8f8240814de0a4fe7851e"

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
