SUMMARY = "Open Source remake of 'One Must Fall 2097'"
DESCRIPTION = "OpenOMF is a open source remake of 'One Must Fall 2097'. \
 \
OMF is a fighting game featuring two robot fighters who fight in a \
single arena. Eleven robots and ten customizable pilots are available \
for play, along with five arenas and four tournaments. The pilots \
vary in strength, speed and endurance."
LICENSE = "MIT"

PV = "0.6.5+git.20190205"

RPM_NAME = "openomf-0.6.5+git.20190205-3.12.aarch64.rpm"
RPM_HASH = "8ab32e7c3d8d7c3681067dbbd5416063efa41b9dd8f0d655d37fd04a7243084c9aa12e7590f277ae85a1ca8561640231229a50d9be7d8999dca99bc509677acd"

RPROVIDES:${PN} += "application() \
application(openomf.desktop) \
openomf \
openomf(aarch-64)"
RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) \
libargtable2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfuse.so.2()(64bit) \
libenet.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libshadowdive.so.0.0.0-suse()(64bit) \
libvorbisfile.so.3()(64bit) \
libxmp.so.4()(64bit) \
libxmp.so.4(XMP_4.0)(64bit) \
libxmp.so.4(XMP_4.1)(64bit) \
libxmp.so.4(XMP_4.4)(64bit)"

inherit rpm
