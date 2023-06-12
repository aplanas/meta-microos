SUMMARY = "Development files for libcsplit, a C split string library"
DESCRIPTION = "A library for C split string functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcsplit."
LICENSE = "LGPL-3.0-or-later"

PV = "20220109"

RPM_NAME = "libcsplit-devel-20220109-3.2.aarch64.rpm"
RPM_HASH = "45217d419f0f210c2372ff73ab1fe0c5a6b6a2edbba6ab836859a4c02777b12203852bd0b34d2d576ea2458a4b7c4c8f8e254fd0b402905a9a7a2859dcfffb8a"

RPROVIDES:${PN} += "libcsplit-devel \
libcsplit-devel(aarch-64) \
pkgconfig(libcsplit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcsplit1"

inherit rpm
