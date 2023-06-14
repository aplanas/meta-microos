SUMMARY = "TCL support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Tcl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-tcl-1.8.2-3.7.aarch64.rpm"
RPM_HASH = "11f7a3f382bfd49b46a3deb93d01aa21d7aeb16c6c645ffc259400551a1b9cb14af63f30a905268211e159f6ab2a660e3120bb63df15ad6a43444507a1bd2b05"

RPROVIDES:${PN} += "znc-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtcl8.6.so \
tcl \
znc"

inherit rpm
