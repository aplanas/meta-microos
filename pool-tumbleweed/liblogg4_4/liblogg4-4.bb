SUMMARY = "Ogg Vorbis support library for Allegro"
DESCRIPTION = "This library allows to use Ogg Vorbis sound files from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg4_4-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "28e2cafcbd3af265ebdd065c35eaf3d12a424f9d05c8db401f22aa39f2b4987566f324e6234251ca564ca7b45b19cb64b9a026f5386e3e7ead4e9be03f62af58"

RPROVIDES:${PN} += "liblogg.so.4.4 \
liblogg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libvorbisfile.so.3"

inherit rpm
