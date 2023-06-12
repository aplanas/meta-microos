SUMMARY = "CSS2 Parser Library Development Files"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-devel-0.6.13-5.3.aarch64.rpm"
RPM_HASH = "54cbf241cd7e25565a927209e6062015042316ae3c8e198c597cc9ff0681ab6983db452426fbdc2d2e0148be66f0cc99789e12cc790c8dde40b5b85eadefbcaa"

RPROVIDES:${PN} += "libcroco-devel \
libcroco-devel(aarch-64) \
pkgconfig(libcroco-0.6)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libcroco \
libcroco-0_6-3 \
pkgconfig(glib-2.0) \
pkgconfig(libxml-2.0)"

inherit rpm
