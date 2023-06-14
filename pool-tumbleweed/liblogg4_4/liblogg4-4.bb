SUMMARY = "Ogg Vorbis support library for Allegro"
DESCRIPTION = "This library allows to use Ogg Vorbis sound files from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg4_4-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "108aaefc588375b89108a7070332eeff2526ae2cdb97c61044ae3d92b3b902caffd60f78a1ab85b7e66011697698fad8d0c62f5fc5a0134113a4bc78cf43cedd"

RPROVIDES:${PN} += "liblogg.so.4.4 \
liblogg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libvorbisfile.so.3"

inherit rpm
