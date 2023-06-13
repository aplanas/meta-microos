SUMMARY = "Spammassassin Client"
DESCRIPTION = "Spamc is the client to contact the spammassassin spamd daemon. It should \
be used in place of 'spamassassin' in scripts to process mail."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "spamassassin-spamc-4.0.0-74.3.aarch64.rpm"
RPM_HASH = "b60f07989bb2e20baf62601bc23fe1339242356a8bd4fb3448c3db3706bbfad59f9f7a5e14d8cdbad0254ae6f4ff848960b65fcb2c01c79ab9aa4af522607625"

RPROVIDES:${PN} += "spamassassin-spamc \
spamassassin-spamc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
