SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as supplied by upstream. It does not \
provide any security restrictions. ImageMagick will be vulnerable \
for example by ImageTragick or PS/PDF coder issues. It should \
be used in trusted environment. Version or maintenance updates \
will not overwrite user changes in system configuration."
LICENSE = "ImageMagick"

PV = "7.1.1.15"

RPM_NAME = "ImageMagick-config-7-upstream-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "6c635fa00435e9a9e32b16fe6ceaecaad953e2bb8db1b65e56697956439ccd435be35e58c1c3bfb63a555bbe25f795c446d8ed821883adb196561b9cdfae1b54"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream \
config-ImageMagick-config-7-upstream \
imagick-config-7"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
