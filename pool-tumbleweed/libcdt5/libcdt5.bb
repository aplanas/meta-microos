SUMMARY = "Container data types for Graphviz"
DESCRIPTION = "Library providing container data types for Graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libcdt5-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "dc91cb3a5ad228a22a83d2e9ff259dfb59c6374aef12b20a5bdfaf941a3d744755b8dd304f302dc8f4982d8cc12ef353a4ddeaab1c50acfc49c44a79d77f1065"

RPROVIDES:${PN} += "libcdt.so.5()(64bit) \
libcdt5 \
libcdt5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
