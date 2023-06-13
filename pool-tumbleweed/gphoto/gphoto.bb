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

RPROVIDES:${PN} += "gphoto \
gphoto(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdk.so.6.2.4()(64bit) \
libcdk.so.6.2.4(CDK_2.0.0)(64bit) \
libexif.so.12()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
