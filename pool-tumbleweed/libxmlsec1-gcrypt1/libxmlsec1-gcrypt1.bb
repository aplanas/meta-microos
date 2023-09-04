SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "GCrypt plugin for XML Security Library provides GCrypt based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gcrypt1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "ba73fe3026c9a00e1b6f5313621e86532bb1589b0878692a38b5574d02fd408b2956430585e9210792c19bca817d71ed3d3ad43d47c9e15074b1356903f774dd"

RPROVIDES:${PN} += "libxmlsec1-gcrypt.so.1 \
libxmlsec1-gcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcrypt.so.20 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
