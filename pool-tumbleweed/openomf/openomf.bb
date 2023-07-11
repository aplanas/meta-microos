SUMMARY = "Open Source remake of 'One Must Fall 2097'"
DESCRIPTION = "OpenOMF is a open source remake of 'One Must Fall 2097'. \
 \
OMF is a fighting game featuring two robot fighters who fight in a \
single arena. Eleven robots and ten customizable pilots are available \
for play, along with five arenas and four tournaments. The pilots \
vary in strength, speed and endurance."
LICENSE = "MIT"

PV = "0.6.5+git.20190205"

RPM_NAME = "openomf-0.6.5+git.20190205-3.13.aarch64.rpm"
RPM_HASH = "3e2914bab5c381003478ceda9a7bdc4c7d25f19ff545d05d9aa2243cb9449c7df70baf0146ea51ad5e0a209e0d72a765384b9010eef25f3e7cc6f1623825c78a"

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
