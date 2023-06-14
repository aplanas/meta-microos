SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoXML92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "943cd604465613d02911cd7314fc2e12fcb83b99102247082126a262672feb0ee9e4a7b993b73a47c1655e84b8001bb318ac70176f1933afcafd0ed2f58f82b1"

RPROVIDES:${PN} += "libPocoXML.so.92 \
libPocoXML92 \
poco-xml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
