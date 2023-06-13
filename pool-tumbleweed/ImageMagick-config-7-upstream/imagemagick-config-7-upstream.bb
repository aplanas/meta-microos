SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as supplied by upstream. It does not \
provide any security restrictions. ImageMagick will be vulnerable \
for example by ImageTragick or PS/PDF coder issues. It should \
be used in trusted environment. Version or maintenance updates \
will not overwrite user changes in system configuration."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "ImageMagick-config-7-upstream-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "1785f0baa27e06ce7c6d7dd66f8ef8966541876f79f55dfc09c2b486c174e042c7b105309f7bd27497fb20f256e2d660762176b578e1a91b18af6903b4c9a601"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream \
ImageMagick-config-7-upstream(aarch-64) \
config(ImageMagick-config-7-upstream) \
imagick-config-7"

RDEPENDS:${PN} += "/bin/sh \
update-alternatives"

inherit rpm
