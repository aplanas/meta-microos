SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python39-nss-1.0.1-4.8.aarch64.rpm"
RPM_HASH = "9ef67647064c3e3b8f5e76598edbccd46220e8a4924b3f32275de4bc74a04636256395142c61543e49f994b48158709d75afef2528434930f455633ed5405093"

RPROVIDES:${PN} += "python3.9dist(python-nss) \
python39-nss \
python39-nss(aarch-64) \
python3dist(python-nss)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libsmime3.so()(64bit) \
libssl3.so()(64bit) \
python(abi)"

inherit rpm
