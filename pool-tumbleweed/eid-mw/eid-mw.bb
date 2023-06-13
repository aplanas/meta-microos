SUMMARY = "Belgium electronic identity card PKCS#11 module and Firefox plugin"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains a few helper \
programs needed by the eID Middleware and the infrastructure for eid-mw."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-mw-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "5e8463bf6639b5cb58f65e8903b0c04fc54180ef855bb9a4ef136557b98084bb0ecb09f4168864c4dbce3e34471cadc38f7eb3203c4c0f8c393ecc91b692a08a"

RPROVIDES:${PN} += "eid-mw \
eid-mw(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
pcsc-ccid"

inherit rpm
