SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataMySQL92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "532d09ba1c0120522b63bdfc6eef88a29a8d27b914a1768421d2bf474990449a4c5b3d319a114be8e3b103f57191eb798a7ad6d56c273e9242825064b3f00e7f"

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
