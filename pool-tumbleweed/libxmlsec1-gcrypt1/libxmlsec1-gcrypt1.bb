SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "GCrypt plugin for XML Security Library provides GCrypt based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gcrypt1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "3e53b3764c73ef758e0abb7ccb150b43e6678881c3670bff275c3e381b9ccd37332682a153cbba770690fdf31203697c122a9541ebd7a789d7a87d24398d9a18"

RPROVIDES:${PN} += "libxmlsec1-gcrypt.so.1 \
libxmlsec1-gcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcrypt.so.20 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
