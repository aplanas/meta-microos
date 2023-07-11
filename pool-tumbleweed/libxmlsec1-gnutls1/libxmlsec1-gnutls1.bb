SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "GNUTls plugin for XML Security Library provides GNUTls based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gnutls1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "8dd8f5b8241b1817ae3c15a4fdf0e582a5f5da60e0a916d6b1fef420aba9969d1c8ecd42cfee5740138df9f8142530e842837a391ed6a2646a3ceeda3213a713"

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
