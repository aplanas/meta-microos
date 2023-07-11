SUMMARY = "Belgium electronic identity card PKCS#11 module - development package"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the files needed \
to develop against the eID Middleware."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.11"

RPM_NAME = "eid-mw-devel-5.1.11-1.1.aarch64.rpm"
RPM_HASH = "3908ba52579a3af1525344420cbf3f9f52e64f0ba0ff6c54a56feeb5b53182e401d0158c6407f305b660825bc87c99e768ace3374e9d6ab58bdcb660818b5074"

RPROVIDES:${PN} += "eid-mw-devel \
pkgconfig-libbeidpkcs11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eid-mw"

inherit rpm
