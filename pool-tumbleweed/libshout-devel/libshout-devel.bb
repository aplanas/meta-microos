SUMMARY = "Development files for libshout, an Icecast communication library"
DESCRIPTION = "This package contains the include files needed to develop \
applications that want to use libshout."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.6"

RPM_NAME = "libshout-devel-2.4.6-1.5.aarch64.rpm"
RPM_HASH = "c08cc1f748f5cbd9cbb3abdbb2dc19a343051ab75b9e03bbc118a337862ea6da1d53dfc4e95de040cb015bf107d48404db96fe7e1a3088577ba4a77bba496b12"

RPROVIDES:${PN} += "libshout-devel \
libshout-devel(aarch-64) \
pkgconfig(shout)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libshout.so.3()(64bit) \
libshout3 \
pkgconfig(ogg) \
pkgconfig(speex) \
pkgconfig(theora) \
pkgconfig(vorbis)"

inherit rpm
