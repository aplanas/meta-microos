SUMMARY = "JBIG2 decoder development files"
DESCRIPTION = "This package contains development files needed for developing applications \
based on libjbig2dec."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "jbig2dec-devel-0.19-1.12.aarch64.rpm"
RPM_HASH = "a3f9ceae64ca861bc040c20f1462b44b962e54d0c8becbd1877b0975618068873de5a89e3866eb4fdd332b1c7815cea964577d6e512c8f8206fbc0afe0aa63d6"

RPROVIDES:${PN} += "jbig2dec-devel \
pkgconfig-jbig2dec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjbig2dec0"

inherit rpm
