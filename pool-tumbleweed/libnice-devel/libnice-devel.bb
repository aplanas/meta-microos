SUMMARY = "Development files for libnice, an implemtation of ICE"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice-devel-0.1.21-3.1.aarch64.rpm"
RPM_HASH = "bb22502f57c1bed24d78fa4272f0e1e40a5c7cee107ad05f55086902929a5f37ab84b1085d7d6ed1bf3fc7941babed08297c77581d28f20751f8b8b885ff7c61"

RPROVIDES:${PN} += "libnice-devel \
libnice-doc \
pkgconfig-nice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnice10 \
pkgconfig-gio-2.0 \
pkgconfig-gnutls \
pkgconfig-gthread-2.0 \
pkgconfig-gupnp-igd-1.6 \
typelib-1-0-Nice-0-1"

inherit rpm
