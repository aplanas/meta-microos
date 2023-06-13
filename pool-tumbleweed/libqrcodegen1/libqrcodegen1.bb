SUMMARY = "QR Code generator library"
DESCRIPTION = "C QR Code generator library"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libqrcodegen1-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "7448052823b09d4aaa362517c242e21ba5d53f7f662307d0997babdd3a4b2b11f4825309965ca5016aa7726372fb9f9a301e97b8a450870d4dfc3985cc30efa1"

RPROVIDES:${PN} += "libqrcodegen.so.1()(64bit) \
libqrcodegen1 \
libqrcodegen1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
