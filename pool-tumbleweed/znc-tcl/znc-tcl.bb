SUMMARY = "TCL support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Tcl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-tcl-1.8.2-3.8.aarch64.rpm"
RPM_HASH = "bb9d39050f89cc474c4c6a13a87cd61259ba902c56c0608e6724eb2b9f5828bd99b959277b8d1bec6cc917bfaa16fa411377e1bd5e60f8db354afe5afad35f77"

RPROVIDES:${PN} += "znc-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtcl8.6.so \
tcl \
znc"

inherit rpm
