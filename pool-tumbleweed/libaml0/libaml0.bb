SUMMARY = "A VNC server library"
DESCRIPTION = "A portable, uitlitarian and simple event loop library."
LICENSE = "ISC"

PV = "0.3.0"

RPM_NAME = "libaml0-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "501824dc6fbece55f0dd974cfa27d6dd1dfbd332c548ec1b136ff67a50e2fb3a7ac3479d32e5d93985b3835edf9c3510813d08f1c501a8798c45924e88c6c69e"

RPROVIDES:${PN} += "libaml.so.0 \
libaml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
