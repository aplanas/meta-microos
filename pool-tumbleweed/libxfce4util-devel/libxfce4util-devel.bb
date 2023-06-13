SUMMARY = "Development Files for libxfce4util"
DESCRIPTION = "This package contains the API documentation and development files needed for \
developing applications based on libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util-devel-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "62a25861c929e17a6391441ff3b511207ea9ea1c6adc672c5978fb7a00f9ba58d62fb878104344658d946b08d23ec0358f5419a8b962ac11989cc660d1f5cc2b"

RPROVIDES:${PN} += "libxfce4util-devel \
libxfce4util-devel(aarch-64) \
pkgconfig(libxfce4util-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfce4util-tools \
libxfce4util7 \
pkgconfig(glib-2.0) \
typelib-1_0-Libxfce4util-1_0"

inherit rpm
