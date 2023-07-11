SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libglapi0-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "09028d490d8743a328fdde105bb547ac07336df4039fc126eed6dc1955c397df1b6d812d0a2167394ad6751d384a9ded68788c0a8f21611aad1edaceb51361d7"

RPROVIDES:${PN} += "Mesa-libglapi0 \
libglapi.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
