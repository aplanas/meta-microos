SUMMARY = "PNG support library for Allegro"
DESCRIPTION = "This library allows to load/save PNG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng4_4-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "790419090c4c8d8bdd44cc49473550d72a101cffaee69d94ab3ed249d46efe812b4a2a958ec8865eccda59afa074d8532e1a07f33adf064cffd1ba75153cc5e1"

RPROVIDES:${PN} += "libloadpng.so.4.4 \
libloadpng4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libpng16.so.16"

inherit rpm
