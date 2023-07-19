SUMMARY = "Nemo extension to mass resize or rotate images"
DESCRIPTION = "This package adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-image-converter-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "1fb2b8e204500cd49b85a242f23c253a3f669259ee94b095067ef3ff22e2d08c79c546d09706a500d46dbf073a84ef17ecf7c15647d789627b20c3689033123e"

RPROVIDES:${PN} += "nemo-extension-image-converter \
nemo-image-converter"

RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
nemo"

inherit rpm
