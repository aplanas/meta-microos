SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoZip92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "85565a90cf597bd3dc2ac9ec4b9a676d66448146cff69c59f17d45efd4fb79c19903b833a33f5a884fd50a5059a8b13e6953f96e64355527c4021c1f241b315b"

RPROVIDES:${PN} += "libPocoZip.so.92 \
libPocoZip92 \
poco-zip"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
