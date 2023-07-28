SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoUtil94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "6b9adaffc80cb9369b5f8fe097fd680f226137ef87d05b5de43a2fe79a779ff5d0459fc26a204cbb60124082cd0c881fe124eacb153c7ef733c3a85aba65967a"

RPROVIDES:${PN} += "libPocoUtil.so.94 \
libPocoUtil94 \
poco-util"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoJSON.so.94 \
libPocoXML.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
