SUMMARY = "Cross-platform library for games and multimedia programming"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. \
 \
A wide range of extension packages and add-on modules are also available, which \
can be found in the 'Library Extensions' section of the Allegro website."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "5a53575a2d6a7f150476adebc105c5fa23e48c556e7d74cd2d0bc10e73b1bc2879d58c35f5341c5263bac2a484f705a039b98188113213659dea4e43a627d8e0"

RPROVIDES:${PN} += "allegro44"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libasound.so.2 \
libc.so.6"

inherit rpm
