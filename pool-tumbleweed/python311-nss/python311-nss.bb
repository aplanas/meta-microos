SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python311-nss-1.0.1-4.8.aarch64.rpm"
RPM_HASH = "9debd259bc247f1570a537d1cf2077dc6ce49660ff2a3ba6880b7e09ece811327d5b07d15764cce504fda43a5de2ae43643a6e1ed0dcbdaf55cc477b9a51a480"

RPROVIDES:${PN} += "python3.11dist-python-nss \
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
