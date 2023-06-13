SUMMARY = "Development files for the X Shm-Fence library"
DESCRIPTION = "This is a tiny library that exposes a event API on top of Linux \
futexes. \
 \
This package contains the development headers for the library found \
in libxshmfence."
LICENSE = "HPND"

PV = "1.3.2"

RPM_NAME = "libxshmfence-devel-1.3.2-1.2.aarch64.rpm"
RPM_HASH = "687620aef21c0adaf4ca91e60e6de170d90e17b3b86fbccb75d5cbdaf1677336a6f237af3a6074e59413607befe6b04ccbc6abc93f4fc7eb1528a5277d81af17"

RPROVIDES:${PN} += "libxshmfence-devel \
libxshmfence-devel(aarch-64) \
pkgconfig(xshmfence)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxshmfence1"

inherit rpm
