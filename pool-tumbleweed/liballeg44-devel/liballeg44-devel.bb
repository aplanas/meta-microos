SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package is needed to \
build programs written with Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg44-devel-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "ffd13f3267130a0701713859e881a11751de9f9ac0af4683d1842a9bc586f078ab741e1891432e36130a764eefe87616d516165e5f8c8483965cf84e892e0673"

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
