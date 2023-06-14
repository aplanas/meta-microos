SUMMARY = "Development files for libnice, an implemtation of ICE"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice-devel-0.1.21-2.1.aarch64.rpm"
RPM_HASH = "450fbc39f3d0b9dc9390c881d196efc2f7a7753dd70e0445a17c17a2b11e691c5febfc65e127c1e1978bf1cb8b3e4e2d8d081d4f0042c8c476e9cf29d8353fa0"

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
