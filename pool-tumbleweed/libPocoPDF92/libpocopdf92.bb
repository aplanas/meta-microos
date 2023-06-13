SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoPDF92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "264ce1bb8690013f3ef4df920dc6c138730504ab0c290277f957bb8a0ff94621e81af1c0002537824b7b3f575e57046dc57eecab2430c872c7bfacf8d01f9f26"

RPROVIDES:${PN} += "libPocoPDF.so.92()(64bit) \
libPocoPDF92 \
libPocoPDF92(aarch-64) \
poco-pdf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoUtil.so.92()(64bit) \
libPocoXML.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
