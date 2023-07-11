SUMMARY = "X Session Manager Proxy"
DESCRIPTION = "smproxy allows X applications that do not support X11R6 session \
management to participate in an X11R6 session."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "smproxy-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "c52633ba48efbcd09b979e56ff0e45da96c98b2a800a483013de72625bc5db1eb02650b9296eb1ef38dbb6c82564af22d3b62c00f2ee1be5cc023a50d78cd5af"

RPROVIDES:${PN} += "smproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXmuu.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
