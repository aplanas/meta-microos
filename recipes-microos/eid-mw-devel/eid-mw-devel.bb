SUMMARY = "Belgium electronic identity card PKCS#11 module - development package"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the files needed \
to develop against the eID Middleware."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-mw-devel-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "e4e3648388b67de0906b1f603ce2a7639247b4ce24a4474da1848c544bf63f8410538ea48424ea874e62b3fa9af9c886a6cd166ad8a4dc0b9c0b27bb0e1b67cc"

RPROVIDES:${PN} += "eid-mw-devel \
eid-mw-devel(aarch-64) \
pkgconfig(libbeidpkcs11)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
eid-mw"

inherit rpm
