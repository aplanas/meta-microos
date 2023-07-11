SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoUtil92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "0580b998d959561f47c398ebfd87b04dda1b510d6bc9e54f9ea17c19d68f75ae6fcb915b7729aea2aa0255ae00f64e602b3d955715e4f7d71944748cff8ec3fa"

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
