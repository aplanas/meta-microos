SUMMARY = "Nemo extension to mass resize or rotate images"
DESCRIPTION = "This package adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-image-converter-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "480ef8813a16706fae37dd7935d4de7fbff8671dcc2ff1da174dfc52d327a69b9cd88cc3edd885671abdc6b8533cfc52803ce82cb52da5c54c057ba83a825f12"

RPROVIDES:${PN} += "nemo-extension-image-converter \
nemo-image-converter"

RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
nemo"

inherit rpm
