SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras (Development files)"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.24"

RPM_NAME = "libexif-devel-0.6.24-1.10.aarch64.rpm"
RPM_HASH = "1d69b1f83533e3abb4cb1abc0c885e729056b84aa7b7ea5aca98886e301e6b23402abadb4a337814b779edf2452737d6d60d0edd1ba228d140426fb5bf62da31"

RPROVIDES:${PN} += "libexif-devel \
pkgconfig-libexif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexif12"

inherit rpm
