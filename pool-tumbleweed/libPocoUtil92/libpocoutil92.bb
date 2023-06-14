SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoUtil92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "880169da8e5f0941e30c585250e29b8e9c087248ee650cb7a5dae2183d7a91b24b08228bb121ead3f521105292d9ced8c8c9165badc8eda16f86427bdaf5f5ff"

RPROVIDES:${PN} += "libPocoUtil.so.92 \
libPocoUtil92 \
poco-util"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoJSON.so.92 \
libPocoXML.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
