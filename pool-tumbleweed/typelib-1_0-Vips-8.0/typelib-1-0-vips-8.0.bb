SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.14.2"

RPM_NAME = "typelib-1_0-Vips-8.0-8.14.2-1.1.aarch64.rpm"
RPM_HASH = "ccd138920af631f05fdabde4ab50d3413a8389773c39df1012db21b3c7fbd36b0eed683eb08879d99a8aad65133aeea14109ad9ecc8faf6b407224049cb342bc"

RPROVIDES:${PN} += "typelib-1-0-Vips-8.0 \
typelib-Vips"

RDEPENDS:${PN} += "libvips.so.42 \
typelib-GLib \
typelib-GObject"

inherit rpm
