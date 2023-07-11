SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjxrglue shared library"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "libjxrglue0-1.1-4.10.aarch64.rpm"
RPM_HASH = "f3ff495058b289bdefe2b8a53a498b21df1bd94dab612719e2c1e59614adf9711445efa751880fe40897eac3215afd65fdc600667e53e09acdf4dfc5fe45b096"

RPROVIDES:${PN} += "libjxrglue.so.0 \
libjxrglue0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpegxr.so.0 \
libm.so.6"

inherit rpm
