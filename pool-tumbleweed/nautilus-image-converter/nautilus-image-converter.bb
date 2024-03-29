SUMMARY = "Nautilus Image Converter"
DESCRIPTION = "The Nautilus-Image-Converter extension allows you to resize/rotate images \
from Nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "nautilus-image-converter-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "8ec3b5b4d3f0b72f62cecb6259041f7965fb238f4bb416194646cac94c0e052d3beca86b7bfba89990be9e1e131000dac27bfcaa4eb8af1d80ff0424ff81ba33"

RPROVIDES:${PN} += "libnautilus-image-converter.so \
nautilus-image-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnautilus-extension.so.4"

inherit rpm
