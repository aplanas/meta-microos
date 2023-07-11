SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python311-nss-1.0.1-6.1.aarch64.rpm"
RPM_HASH = "5b1a186c1359f0ba1573ecaa32e7f579f880019881f74cdb442c612f2eb713aee302d20c7bbd877bc9f9ef5c8f081cee12f3bd8df51284fc1ded1fe516bddfe0"

RPROVIDES:${PN} += "python3-nss \
python3.11dist-python-nss \
python311-nss \
python3dist-python-nss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libssl3.so \
python-abi"

inherit rpm
