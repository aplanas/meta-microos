SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoXML92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "945db1ff21ff04257cbd059f79c370f4db51af16bf56d54622577e2839f9aaf7e47ff2ec1f64d444c358c0578f4b48428102db40ab4b35d8cd91da11a3e289fb"

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
