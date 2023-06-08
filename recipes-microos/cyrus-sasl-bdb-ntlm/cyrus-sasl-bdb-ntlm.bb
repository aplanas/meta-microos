SUMMARY = "Plugin for the NTLM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-ntlm-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "4c4668e3251e9341353e5df700298c898d358f99d887dc864ebac87de5cd240cbd3444930302b4c0055cf867da5e8a13d3b622ff855cebb7a13093cb1b7dcd9a"

RPROVIDES:${PN} += "cyrus-sasl-bdb-ntlm cyrus-sasl-bdb-ntlm(aarch-64) libntlm.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl-bdb ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
