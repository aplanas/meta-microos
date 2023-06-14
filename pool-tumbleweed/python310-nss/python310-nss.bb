SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python310-nss-1.0.1-4.8.aarch64.rpm"
RPM_HASH = "2a89d212e279526c3a4cc6430e437eda6970dbcec3b2e46f92ef269f4444c0e677ee2387d7ad495769a511c540d68e0e445e9ac5b209626dd393b3755d1763b2"

RPROVIDES:${PN} += "python3-nss \
python3.10dist-python-nss \
python310-nss \
python3dist-python-nss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libssl3.so \
python-abi"

inherit rpm
