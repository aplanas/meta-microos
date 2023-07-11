SUMMARY = "Spammassassin Client"
DESCRIPTION = "Spamc is the client to contact the spammassassin spamd daemon. It should \
be used in place of 'spamassassin' in scripts to process mail."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "spamassassin-spamc-4.0.0-74.5.aarch64.rpm"
RPM_HASH = "42a5e7b0291d787c2a71e3ca29e2f2662191f599b598068c58a9662c0dda7c45c8a1e61a4dc7f1e58f26087716fcd9f466ae3f1ea2cf508c11b9b72a0926b807"

RPROVIDES:${PN} += "spamassassin-spamc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
