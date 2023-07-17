SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-static-2.39-2.1.aarch64.rpm"
RPM_HASH = "9f315b2711bba28927af7881c51a4a9075f03fd08e52dd93a12d3c8c1903c334ef8e330cd62f942d1d91abff9bc37ed26b638aa042927b41aede205569654f8e"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
