SUMMARY = "GLX-based demos"
DESCRIPTION = "This package contains some common GLX-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-x-9.0.0-1.2.aarch64.rpm"
RPM_HASH = "33865ef17231963a809e6f4c01651f48850fc2f6c75073c9d930f7a3fd1015de9b91f24bb37e07ca4f3be3685df8831f5c100e924881c883aa1879ebc776af35"

RPROVIDES:${PN} += "Mesa-demo-x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
