SUMMARY = "Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "A companion library to APR, the Apache Portable Runtime."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "478895210b25b5d3a345328cf0982ef5714c0937a3b5a0808d1f0dcede424f9964abff1c5205aa5798777d38ed2daa6d71b5da14c171cab129f55fb7f6f3a219"

RPROVIDES:${PN} += "libapr-util1-0 \
libaprutil-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexpat.so.1 \
libgdbm.so.6 \
libldap.so.2"

inherit rpm
