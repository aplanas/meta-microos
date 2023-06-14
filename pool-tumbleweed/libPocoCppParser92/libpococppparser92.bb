SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoCppParser92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "339bd98d1e06cdf7756371fba20e065a230bc1f3e39d0b2e06746214dc994ff36ddddcc1659af08cbf5fda653dbe8c40b21924d35c931af8bb772844ce9ff91d"

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
