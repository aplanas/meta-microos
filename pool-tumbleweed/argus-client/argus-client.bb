SUMMARY = "Client for Network Monitoring Tool"
DESCRIPTION = "Client for Argus network monitoring tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8.2"

RPM_NAME = "argus-client-3.0.8.2-3.16.aarch64.rpm"
RPM_HASH = "89e36e6fc1198b7ed5230354a3e06af2ab734fd163c9e768661c18badd203c16f1663f36efaa0e00f7566ae8849e1c414790d1157fb252529846c947d665888d"

RPROVIDES:${PN} += "argus-client \
config-argus-client"

RDEPENDS:${PN} += "/usr/bin/perl \
argus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
libwrap.so.0"

inherit rpm
