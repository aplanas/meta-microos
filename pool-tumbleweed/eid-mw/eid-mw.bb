SUMMARY = "Belgium electronic identity card PKCS#11 module and Firefox plugin"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains a few helper \
programs needed by the eID Middleware and the infrastructure for eid-mw."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.11"

RPM_NAME = "eid-mw-5.1.11-1.1.aarch64.rpm"
RPM_HASH = "83d83122ea97c4ca0d63e6e080ac626cf0afc68c05bcfc96dbb4752bc16c60e720bee2d9d39a6c494803e6c24078c085f44220275925e1bfb8595fee0a2ce102"

RPROVIDES:${PN} += "eid-mw"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pcsc-ccid"

inherit rpm
