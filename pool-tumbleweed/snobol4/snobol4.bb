SUMMARY = "A port of Macro SNOBOL4"
DESCRIPTION = "This is a free port of the original SIL (SNOBOL4 Implementation \
Language) 'macro' version of SNOBOL4 (developed at Bell Labs) with the \
`C' language as a target. \
 \
SNOBOL4, while known primarily as a string language excels at any task \
involving symbolic manipulations.  It provides dynamic typing, garbage \
collection, user data types, on the fly compilation."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-2.3.1-2.1.aarch64.rpm"
RPM_HASH = "791562da3ef9c9fb7321ebebedfd0f4b3e7149139dced6394472afbe99cc44a494c659e7e94da178133e65aac2befcd041f2cc20fadb1d8a031eb8b6f78536d4"

RPROVIDES:${PN} += "snobol4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgdbm-compat.so.4 \
liblzma.so.5 \
libm.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
libssl.so.3 \
libtcl8.6.so \
libz.so.1"

inherit rpm
