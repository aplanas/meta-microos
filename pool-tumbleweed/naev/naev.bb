SUMMARY = "2D action RPG space game"
DESCRIPTION = "Naev is a 2D space trading and combat game, in a similar vein to Escape Velocity. \
 \
Naev is played from a top-down perspective, featuring fast-paced combat, many ships, \
a large variety of equipment and a large galaxy to explore. The game is \
open-ended, letting you proceed at your own pace."
LICENSE = "GPL-3.0-only"

PV = "0.10.5"

RPM_NAME = "naev-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "02e435efdf372356f9ad33a72242c087917d9c6c9c5f8e97402c2ae30bda068df2c5c73b884646000cfd231ad568aebbe1b6b785cb9d78c3a5067611869e5e20"

RPROVIDES:${PN} += "application() \
application(org.naev.Naev.desktop) \
metainfo() \
metainfo(org.naev.Naev.metainfo.xml) \
naev \
naev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcholmod.so.3()(64bit) \
libcxsparse.so.3()(64bit) \
libenet.so.7()(64bit) \
libfreetype.so.6()(64bit) \
libglpk.so.40()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopenal.so.1()(64bit) \
libopenblas.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libphysfs.so.1()(64bit) \
libunibreak.so.5()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit)"

inherit rpm
