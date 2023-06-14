SUMMARY = "A Digital Camera Utility"
DESCRIPTION = "gPhoto (GNU Photo) is a command line tool for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol, because those can be mounted by Linux directly. Find \
the list of supported cameras at the following URL: \
 \
https://gphoto.sourceforge.io/proj/libgphoto2/support.php \
 \
or by running \
 \
gphoto2 --list-cameras"
LICENSE = "GPL-2.0-or-later"

PV = "2.5.28"

RPM_NAME = "gphoto-2.5.28-2.5.aarch64.rpm"
RPM_HASH = "dd43348159458f57bf7cf49285e9f5f5235f6c8ef968c8ffae047d6d38e7f511a962d47e72f5963b16e738b8a1f9f441081ec1190b43abd4c5dbed4872f1e09a"

RPROVIDES:${PN} += "gphoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdk.so.6.2.4 \
libexif.so.12 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libncurses.so.6 \
libpopt.so.0 \
libreadline.so.8"

inherit rpm
