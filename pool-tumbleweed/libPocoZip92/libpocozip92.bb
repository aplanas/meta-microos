SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoZip92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "d8943c85bc7ce87e46c7fcfaf002cf082708e29edab0fdf1b9df70f7b591e39fe5142cfb159eaba02f6f5bf86d468aa6e2c5eddf92f69baa2a67db1697cfebc7"

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
