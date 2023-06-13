SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoPrometheus92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "85895e7a7628da5e5079f6cfd1eb1d06e4f55309fb33360a12172e9590944c5c6d53c71d3da2e6fb2dc7244c378bb22790417b453f163e6e0404adfcd2718403"

RPROVIDES:${PN} += "libPocoPrometheus.so.92()(64bit) \
libPocoPrometheus92 \
libPocoPrometheus92(aarch-64) \
poco-prometheus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoNet.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
