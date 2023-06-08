SUMMARY = "Belgium electronic identity card PKCS#11 module - libraries"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the actual libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-mw-libs-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "151b60594b74ebecd14a33ca07a10a013bb0f4d176fb1f112f8e3c9f5179c89dd44b8823ed6c48788ccb2c36588e5523ffa88f4d5caa63fe583b8172a4b31ea9"

RPROVIDES:${PN} += "eid-mw-libs eid-mw-libs(aarch-64) libbeidpkcs11.so.0()(64bit) libeidviewer.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpcsclite.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit)"

inherit rpm
