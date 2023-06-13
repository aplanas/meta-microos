SUMMARY = "EDID over DDC Detection"
DESCRIPTION = "Provide EDID detection through display data channel (DDC) communication."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmDDC0-0.5.4-1.22.aarch64.rpm"
RPM_HASH = "763c2b2c39151b64d58c9bd2276a72582a7cab882b20a5e8e09ecc47fa12abde434b65b6e0f49c55b40241a1b25865acf8cff2d9df34eda2d31cb95da1375ebc"

RPROVIDES:${PN} += "libXcmDDC.so.0()(64bit) \
libXcmDDC0 \
libXcmDDC0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
