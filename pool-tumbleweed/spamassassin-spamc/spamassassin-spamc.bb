SUMMARY = "Spammassassin Client"
DESCRIPTION = "Spamc is the client to contact the spammassassin spamd daemon. It should \
be used in place of 'spamassassin' in scripts to process mail."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "spamassassin-spamc-4.0.0-74.6.aarch64.rpm"
RPM_HASH = "964cd1f764908a21c67d912592f972fa3c23e67086bbe8205a16aa41f26d55d403d8f47ce33572ee36cb1e4d8f3c06e8e57ba5f6c02e621e1c4477f5ff5a15fe"

RPROVIDES:${PN} += "spamassassin-spamc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
