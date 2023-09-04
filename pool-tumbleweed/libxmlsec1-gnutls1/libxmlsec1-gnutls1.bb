SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "GNUTls plugin for XML Security Library provides GNUTls based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gnutls1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "d0f5d0d32750ce39fe781b79c725c8f9839e6e4687e75fb36d1292c6c5ebe1daff9efa4a43e8670844db7785ca5576d527c1bca34a040dbbd1de538b4ac98ad6"

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
