SUMMARY = "Motif runtime library"
DESCRIPTION = "This package provides the main Motif shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libXm4-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "4fdf6f40128a4fb26959d484ce8fc08e6f649426bd09fe1b4931646bf7f9ea4e584237368746f93ed8d919cea7a516e4dd144d68b510819828a45bad6b0ac35d"

RPROVIDES:${PN} += "libXm.so.4 \
libXm4 \
openmotif-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXp.so.6 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
