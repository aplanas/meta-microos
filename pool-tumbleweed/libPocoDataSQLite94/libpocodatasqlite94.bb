SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoDataSQLite94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "f2d7aa6cfa210d54aac6e3c88a9c68b346479d02beead6491bb6d9d25f14f48e14a66e617836736ebfe51233106b9bb45d343ddcb1b6bf6a22cde35b29a705da"

RPROVIDES:${PN} += "libPocoDataSQLite.so.94 \
libPocoDataSQLite94 \
poco-datasqlite"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.94 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
