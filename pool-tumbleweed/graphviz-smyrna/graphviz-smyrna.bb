SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-smyrna-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "9afd813367add5c484b69a96b8f24ea49ee467a1dfc165da466ccead86e7c7434844d842960a9f0fd673f5ebf09fa47bbd224bf69a899bcd88048b55215846eb"

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
