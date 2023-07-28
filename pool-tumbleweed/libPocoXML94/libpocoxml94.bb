SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoXML94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "d3fea45dced346218ed76d7c7b3362f8e929eaa491ee4bfaecd01fe10b50dc2638804ccefe7495ba8e7f2be7eb5b4596febbae911e920d95e28793731ab2ea94"

RPROVIDES:${PN} += "libPocoXML.so.94 \
libPocoXML94 \
poco-xml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
