SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-smyrna-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "9afd813367add5c484b69a96b8f24ea49ee467a1dfc165da466ccead86e7c7434844d842960a9f0fd673f5ebf09fa47bbd224bf69a899bcd88048b55215846eb"

RPROVIDES:${PN} += "graphviz-smyrna \
graphviz-smyrna(aarch-64)"
RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcdt.so.5()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdkglext-x11-1.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libglut.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkglext-x11-1.0.so.0()(64bit) \
libgts-0.7.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
