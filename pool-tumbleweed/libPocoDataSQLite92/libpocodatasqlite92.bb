SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataSQLite92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "eaad48ca3b0aee0b92fa13986a4b8184b7dae5dfb2f578fcb214530a8bf2d064a208a4afa88f7b738ff310b0bdad61e2e763c7621933bdf0767464d3d7f34f06"

RPROVIDES:${PN} += "libPocoDataSQLite.so.92 \
libPocoDataSQLite92 \
poco-datasqlite"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.92 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
