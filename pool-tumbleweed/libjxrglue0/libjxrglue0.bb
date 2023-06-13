SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjxrglue shared library"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "libjxrglue0-1.1-4.9.aarch64.rpm"
RPM_HASH = "bbde3058072f96f1d4de4c0cb2c7beaf83af7cb0e8ea6a0d68b33fa3ed07867c1c4244d3c9d86ab8847cf3d4de86706900b9d484ed05cd8011fc63dce81c07ae"

RPROVIDES:${PN} += "libjxrglue.so.0()(64bit) \
libjxrglue0 \
libjxrglue0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjpegxr.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
