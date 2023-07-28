SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoPDF94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "6145fc62486020673798f78ac547707db9bd587d266bc13a0556e895b8d8423c0f95b948bffe57b06ff6670cbef71e50a5f3a128ff4400388a2b979082861abf"

RPROVIDES:${PN} += "libPocoPDF.so.94 \
libPocoPDF94 \
poco-pdf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoUtil.so.94 \
libPocoXML.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
