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

RPM_NAME = "gphoto-2.5.28-2.7.aarch64.rpm"
RPM_HASH = "acd0ed7def88c31ed18812f8e1334ad4f1e22dd4912827ac0f00f3ba4926a3540017cb7531fadf2adc5d7f43067acbb909e0f5d550f91bcf7e9012feeb7f4551"

RPROVIDES:${PN} += "gphoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdk.so.6.3.4 \
libexif.so.12 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libncurses.so.6 \
libpopt.so.0 \
libreadline.so.8"

inherit rpm
