SUMMARY = "Development files for tinygettext"
DESCRIPTION = "This package contains the development files, like headers etc, for tinygettext."
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "tinygettext-devel-0.1.1469459657.bf66a57-1.27.aarch64.rpm"
RPM_HASH = "f0ccc432909008a560d7910fdc0279d15738b4439f329774e12d4a565c79435409f8e177a529ca3f88e899749c82bfa6ca67e16e71788f7e1d931c031e612af3"

RPROVIDES:${PN} += "pkgconfig-tinygettext \
tinygettext-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinygettext0"

inherit rpm
