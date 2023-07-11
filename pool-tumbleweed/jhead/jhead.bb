SUMMARY = "Tool to Manipulate the Nonimage Part of EXIF Compliant JPEG Files"
DESCRIPTION = "Jhead is a command line utility for extracting digital camera settings \
from the EXIF format files used by many digital cameras. It handles the \
various confusing ways these can be expressed and displays them as \
F-stop, shutter speed, and more. It is also able to reduce the size of \
digital camera JPEG files without loss of information by deleting \
thumbnails that digital cameras put into the EXIF header."
LICENSE = "SUSE-Public-Domain"

PV = "3.08"

RPM_NAME = "jhead-3.08-1.1.aarch64.rpm"
RPM_HASH = "21c57d50a0ff4dff0c5fdf1179f16075cee54f847494542894629ab59f91f3994b1f0fe3f90f77a204a71c671223e57283aab9ccdd7b29a6052fc1d179e9ec6a"

RPROVIDES:${PN} += "jhead"

RDEPENDS:${PN} += "/usr/bin/jpegtran \
/usr/bin/mogrify \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
