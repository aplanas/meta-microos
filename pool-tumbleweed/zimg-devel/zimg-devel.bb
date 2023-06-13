SUMMARY = "Development files for libzimg2"
DESCRIPTION = "The libzimg-devel package contains libraries and header files for \
developing applications that use libzimg2."
LICENSE = "WTFPL"

PV = "3.0.4"

RPM_NAME = "zimg-devel-3.0.4-1.5.aarch64.rpm"
RPM_HASH = "37c1db485fe019cea800fdafc9fee3386fa9c5aa17259b4949e508fec84f90b55a81956a62953d36cdbfb3b9582aaebedace20fc26764984e15f647743ccfbf3"

RPROVIDES:${PN} += "pkgconfig(zimg) \
zimg-devel \
zimg-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzimg2"

inherit rpm
