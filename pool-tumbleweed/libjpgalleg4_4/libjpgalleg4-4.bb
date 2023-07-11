SUMMARY = "JPEG support library for Allegro"
DESCRIPTION = "This library allows to load/save JPG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg4_4-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "4e7e914e5c950ce478dfcc616e4d9ba3849b5c980eb3e4fe7dd04c8f061ec6ecc4219686a627c18eaa28eb99f4b0700ca625c0a1a626f9d91469f5e8e63a351d"

RPROVIDES:${PN} += "libjpgalleg.so.4.4 \
libjpgalleg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libm.so.6"

inherit rpm
