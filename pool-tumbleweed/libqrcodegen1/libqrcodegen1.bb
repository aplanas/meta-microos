SUMMARY = "QR Code generator library"
DESCRIPTION = "C QR Code generator library"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libqrcodegen1-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "9b380542422a15cb4fc9c6cecd5123b06d9c7a849b7144ca3aa18f9681a4934ed05e3a09f24173d6fe21a0ee42fd0e168c75ea188d3c0afee68c3fe8e9ee98af"

RPROVIDES:${PN} += "libqrcodegen.so.1 \
libqrcodegen1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
