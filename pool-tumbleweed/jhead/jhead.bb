SUMMARY = "Tool to Manipulate the Nonimage Part of EXIF Compliant JPEG Files"
DESCRIPTION = "Jhead is a command line utility for extracting digital camera settings \
from the EXIF format files used by many digital cameras. It handles the \
various confusing ways these can be expressed and displays them as \
F-stop, shutter speed, and more. It is also able to reduce the size of \
digital camera JPEG files without loss of information by deleting \
thumbnails that digital cameras put into the EXIF header."
LICENSE = "SUSE-Public-Domain"

PV = "3.06.0.1"

RPM_NAME = "jhead-3.06.0.1-5.3.aarch64.rpm"
RPM_HASH = "78c9a6f08d1b399be49fec2d38c5a20ab13c6dd5ea4e9885d10c4fc85445616f503b29b499ce750d9d2f362ac875c771852039a309c0694233ca2c3e89757955"

RPROVIDES:${PN} += "jhead \
jhead(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/jpegtran \
/usr/bin/mogrify \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
