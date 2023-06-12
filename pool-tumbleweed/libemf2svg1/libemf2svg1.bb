SUMMARY = "EMF (Enhanced Metafile) to SVG conversion library"
DESCRIPTION = "Library for converting Enhanced Metafile (EMF and EMF+) files to the \
SVG format. It can be used for conversion of standalone EMF files, \
but more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg1-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "dec08e03d10122832243cfd2f89ef169a6749fd32ba0adcc5127f1bd1c3f8df19fcceb59bebc6b2876451cb4d49e93515a089f226480d058cee06299dea37967"

RPROVIDES:${PN} += "libemf2svg.so.1()(64bit) \
libemf2svg1 \
libemf2svg1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
