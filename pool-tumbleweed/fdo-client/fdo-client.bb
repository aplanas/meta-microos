SUMMARY = "FIDO Device Onboard Client"
DESCRIPTION = "FDO-Client is a portable implementation of the FIDO Device Onboard Spec. \
This component is portable across multiple environments, \
including to various microprocessors (MPUs) and microcontrollers (MCUs)."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-1.1.4+git20221209.c8ef757-1.3.aarch64.rpm"
RPM_HASH = "a3858de320dd0e0f5703958c8530869996bef1dfb3cee1a1c82aa7fb83edf7662f7f5c03bebb87b7aac5d1eebe2f56eb0b76b87c086d057d0f3fff79fd7c87d1"

RPROVIDES:${PN} += "fdo-client \
fdo-client(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
openssl"

inherit rpm