SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "c82a4801f9939fe983e56862c6b9a9ea3f83214bd95d9270cea66fc5e14c1c9bb910ee166eb697be1ff898aee7ff47935de697ad537e16c5388133905c63d2e1"

RPROVIDES:${PN} += "libxmlsec1-1 \
libxmlsec1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libltdl.so.7 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
