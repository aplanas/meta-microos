SUMMARY = "Plugin for the NTLM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ntlm-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "1a19310e32579e5e72acf0f5c74fd8d67611a19f9fa01c9db0b91149446cf9da8352baa0e5ab2bcd81053ce102fecf73f87d8d7715f944c83cdf3bda05868172"

RPROVIDES:${PN} += "cyrus-sasl-ntlm \
libntlm.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
