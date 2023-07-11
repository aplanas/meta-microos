SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoCppParser92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "f65d76a69db1d272472b85d2a28b9a8ba421e92bb852215a45e7480c1d17b87971c9737a88da4b0acc593890807639ede1d4ad5655da54921923558133655ab6"

RPROVIDES:${PN} += "libPocoCppParser.so.92 \
libPocoCppParser92 \
poco-cppparser"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
