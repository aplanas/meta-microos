SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package contains the encoder and the decoder tools."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "jxrlib-1.1-4.10.aarch64.rpm"
RPM_HASH = "adf9a764e2043ac94975b7a79cc245a39fcc1451df72b01bd0ee11068cec9af9b436ab6f31ed3375181c410693db987d070f94b5f2eed8362f63d3913e5cb12c"

RPROVIDES:${PN} += "jxrlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjxrglue.so.0"

inherit rpm
