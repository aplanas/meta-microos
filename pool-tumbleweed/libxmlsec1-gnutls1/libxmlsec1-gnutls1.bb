SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "GNUTls plugin for XML Security Library provides GNUTls based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gnutls1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "0e4b5191b72228e7b42200faaccb62c3c7aab2d473589a6570ec97b6cb8babe8885784d0b6102638b38488557d284cdd20da3a558c23e5314d3e327caa684f61"

RPROVIDES:${PN} += "libxmlsec1-gnutls.so.1 \
libxmlsec1-gnutls1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgnutls.so.30 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1-gcrypt.so.1 \
libxmlsec1.so.1"

inherit rpm
