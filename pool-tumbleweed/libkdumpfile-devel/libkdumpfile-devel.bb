SUMMARY = "Include files and libraries for libkdumpfile development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libkdumpfile."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libkdumpfile-devel-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "eb38af2b25ea17095d3020b494f201c06c30982192227a9cb74babf93822942bc025d059a42ea5c03f077a73a59c256330d41d145a3a7d3a33be694bfda109d2"

RPROVIDES:${PN} += "libkdumpfile-devel \
libkdumpfile-devel(aarch-64) \
pkgconfig(libkdumpfile)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkdumpfile10 \
pkgconfig(libaddrxlat) \
pkgconfig(libzstd) \
pkgconfig(lzo2) \
pkgconfig(snappy) \
pkgconfig(zlib)"

inherit rpm
