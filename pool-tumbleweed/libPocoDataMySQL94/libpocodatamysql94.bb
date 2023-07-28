SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoDataMySQL94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "b68dae6179b51c1da19d228c7907e67801c1d1fef5ce3dab9760d179e96072992c5dbc315e7b79fac71bd00494137b1df0139804f239fdcd07034f3cdd517edc"

RPROVIDES:${PN} += "libPocoDataMySQL.so.94 \
libPocoDataMySQL94 \
poco-datamysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.94 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
