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

RPROVIDES:${PN} += "openomf"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libargtable2.so.0 \
libc.so.6 \
libconfuse.so.2 \
libenet.so.7 \
libm.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libshadowdive.so.0.0.0-suse \
libvorbisfile.so.3 \
libxmp.so.4"

inherit rpm
