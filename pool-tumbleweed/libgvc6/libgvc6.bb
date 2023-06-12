SUMMARY = "Graphviz context library"
DESCRIPTION = "libgvc provides a context for applications wishing to manipulate and render \
graphs. It provides a command line parsing, common rendering code, and a \
plugin mechanism for renderers."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libgvc6-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "82c66bc6784915e090dfcaf6dce7a963ec2a9d039c8d25583e9c5d507d70fdf89f220014fcaaf7280dd92b17ef9a46588a73c689db914a04a3df656b61ff254e"

RPROVIDES:${PN} += "libgraphviz6:/usr/lib64/libgvc.so.6 \
libgvc.so.6()(64bit) \
libgvc6 \
libgvc6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcdt.so.5()(64bit) \
libcgraph.so.6()(64bit) \
libexpat.so.1()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpathplan.so.4()(64bit) \
libz.so.1()(64bit)"

inherit rpm
