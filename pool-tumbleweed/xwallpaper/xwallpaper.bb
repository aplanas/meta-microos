SUMMARY = "Wallpaper setting utility for X"
DESCRIPTION = "The xwallpaper utility allows you to set image files as your X wallpaper. JPEG, PNG, and XPM file formats are supported, all of them being configurable and therefore no fixed dependencies."
LICENSE = "ISC"

PV = "0.7.4"

RPM_NAME = "xwallpaper-0.7.4-1.3.aarch64.rpm"
RPM_HASH = "648629405cad86d6fbcebe229c3f30a99e9bd2faf18a7fba9f7ee3097f3ad56549dab828efe5d3abaa37e3d6e296c82494b9bf236d0e4074535e3c71c011b2c3"

RPROVIDES:${PN} += "xwallpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libc.so.6 \
libjpeg.so.8 \
libpixman-1.so.0 \
libpng16.so.16 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
