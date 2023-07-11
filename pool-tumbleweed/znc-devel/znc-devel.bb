SUMMARY = "Development files to build modules for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the development headers for developing modules for ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-devel-1.8.2-3.8.aarch64.rpm"
RPM_HASH = "003477736c75537434a2aab56dae46465ece8209820550240c73587e0892f017fe667f24492019e6f9a8841c6efcb2c1f988d1ebbc964fa297a7a78b2d32f340"

RPROVIDES:${PN} += "pkgconfig-znc \
znc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
znc"

inherit rpm
