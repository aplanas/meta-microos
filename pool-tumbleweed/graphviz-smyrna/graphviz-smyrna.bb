SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-smyrna-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "668ce03dc9644d89ed73641d6072eb7cd4f8b5f64b2b415e2b5a5f13b08d38b7e0889b087e8db3a27eb31de5bcb50cfd208199683433b037c0b7d2772272a33d"

RPROVIDES:${PN} += "graphviz-smyrna"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libcairo.so.2 \
libcdt.so.5 \
libgdk-x11-2.0.so.0 \
libgdkglext-x11-1.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libglut.so.3 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkglext-x11-1.0.so.0 \
libgts-0.7.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
