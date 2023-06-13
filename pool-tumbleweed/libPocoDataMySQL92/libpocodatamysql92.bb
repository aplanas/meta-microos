SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataMySQL92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "532d09ba1c0120522b63bdfc6eef88a29a8d27b914a1768421d2bf474990449a4c5b3d319a114be8e3b103f57191eb798a7ad6d56c273e9242825064b3f00e7f"

RPROVIDES:${PN} += "libPocoDataMySQL.so.92()(64bit) \
libPocoDataMySQL92 \
libPocoDataMySQL92(aarch-64) \
poco-datamysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoData.so.92()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
