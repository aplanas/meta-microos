SUMMARY = "Plugin for the NTLM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-ntlm-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "4c4668e3251e9341353e5df700298c898d358f99d887dc864ebac87de5cd240cbd3444930302b4c0055cf867da5e8a13d3b622ff855cebb7a13093cb1b7dcd9a"

RPROVIDES:${PN} += "cyrus-sasl-bdb-ntlm \
libntlm.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
