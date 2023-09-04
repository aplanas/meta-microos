SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-smyrna-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "db20011d7e5e38ae362d6939d1285846d6ec58443f284908a5f69e84713098b6035ff8b625d23e6d5986ca0e2ced35685e40ff03ee7fb93f044ac1e44963c50b"

RPROVIDES:${PN} += "graphviz-smyrna"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
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
