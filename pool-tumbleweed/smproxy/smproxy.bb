SUMMARY = "X Session Manager Proxy"
DESCRIPTION = "smproxy allows X applications that do not support X11R6 session \
management to participate in an X11R6 session."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "smproxy-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "8c79e92f7522092346997ebac36fadd130044374597892753453e6f9310de9c489da939759cfa8123e39c04a2aa9a3631ddd5df0ae5751b52bde6e3f1dfb1e28"

RPROVIDES:${PN} += "smproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXmuu.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
