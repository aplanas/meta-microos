SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as supplied by upstream. It does not \
provide any security restrictions. ImageMagick will be vulnerable \
for example by ImageTragick or PS/PDF coder issues. It should \
be used in trusted environment. Version or maintenance updates \
will not overwrite user changes in system configuration."
LICENSE = "ImageMagick"

PV = "7.1.1.8"

RPM_NAME = "ImageMagick-config-7-upstream-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "d8ed85bb4c5afbc0552f71d5094e9b612e54825771a1e5d78ec66e49a3de5895823b99a19af16d897af4a56223df228e190603dd49c670395c177854ee7cdd70"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream ImageMagick-config-7-upstream(aarch-64) config(ImageMagick-config-7-upstream) imagick-config-7"
RDEPENDS:${PN} += "/bin/sh update-alternatives"

inherit rpm
