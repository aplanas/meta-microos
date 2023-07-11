SUMMARY = "CSS2 Parser Library Development Files"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-devel-0.6.13-5.4.aarch64.rpm"
RPM_HASH = "84ee6fa4404ed821fcfb6060c9a75885481f270ece15dd20a0842c07f01225fb3903bdb14e97138715140090d105eb5ec0760c0fb4083d51941b388855996165"

RPROVIDES:${PN} += "libcroco-devel \
pkgconfig-libcroco-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcroco \
libcroco-0-6-3 \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
