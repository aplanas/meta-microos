SUMMARY = "Belgium electronic identity card PKCS#11 module - libraries"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the actual libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-mw-libs-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "151b60594b74ebecd14a33ca07a10a013bb0f4d176fb1f112f8e3c9f5179c89dd44b8823ed6c48788ccb2c36588e5523ffa88f4d5caa63fe583b8172a4b31ea9"

RPROVIDES:${PN} += "eid-mw-libs \
eid-mw-libs(aarch-64) \
libbeidpkcs11.so.0()(64bit) \
libeidviewer.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libpcsclite.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
