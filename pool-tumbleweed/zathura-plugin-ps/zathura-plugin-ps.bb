SUMMARY = "PS support for zathura via libspectre"
DESCRIPTION = "The zathura-ps plugin adds PostScript support to zathura by using the libspectre library."
LICENSE = "Zlib"

PV = "0.2.7"

RPM_NAME = "zathura-plugin-ps-0.2.7-1.3.aarch64.rpm"
RPM_HASH = "d10b08bd24a96686ae2be21669e3ea44ff069cac7c6ad75e2d63ccd9dd42b4a1d27bece982eac4e5b91cee83b1a63ea3dab967fd4420b22d0729bfb511300cf8"

RPROVIDES:${PN} += "libps.so \
zathura-plugin-ps \
zathura-ps-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara-gtk3.so.3 \
libspectre.so.1 \
zathura"

inherit rpm
