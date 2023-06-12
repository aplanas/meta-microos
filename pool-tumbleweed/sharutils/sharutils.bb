SUMMARY = "GNU shar utilities"
DESCRIPTION = "This is the set of GNU shar utilities. \
 \
shar makes shell archives out of many files, preparing them for \
transmission by electronic mail services.  Use unshar to unpack shell \
archives after reception. \
 \
uuencode prepares a file for transmission over an electronic channel \
which ignores or otherwise mangles the eight bit (high order bit) of \
bytes.	uudecode does the converse transformation."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-4.15.2-7.6.aarch64.rpm"
RPM_HASH = "51305f3b287d218bed34f74640e1410e67a65a114c4e954eab99f174798236c9e2ff793b0bc84e17c83b199fd5182c55d101a9f9528ea619ecf4841e8497e3e0"

RPROVIDES:${PN} += "sharutil \
sharutils \
sharutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
