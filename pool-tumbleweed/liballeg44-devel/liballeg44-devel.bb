SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package is needed to \
build programs written with Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg44-devel-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "a466b302d6ba2393b80675a57647f9b3c4e756c116d4e437909eb9faece3ec52f08772fc0532074a9e981fecf272644d9da336004e3b9b8c63505de36b15cdb2"

RPROVIDES:${PN} += "allegro-devel \
liballeg-devel \
liballeg44-devel \
pkgconfig-allegro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
allegro44 \
ld-linux-aarch64.so.1 \
liballeg4-4 \
libc.so.6 \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xext \
pkgconfig-xproto \
pkgconfig-xxf86vm"

inherit rpm
