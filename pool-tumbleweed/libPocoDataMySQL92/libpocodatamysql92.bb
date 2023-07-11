SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataMySQL92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "819ea9438864eeb9a9e35f84f7f3d215362b3b60a677174138d9b960ff28b3767028c95106757645799408aea777b948a58edf61f9554fabb8d1a2bb96fcb809"

RPROVIDES:${PN} += "libPocoDataMySQL.so.92 \
libPocoDataMySQL92 \
poco-datamysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.92 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
