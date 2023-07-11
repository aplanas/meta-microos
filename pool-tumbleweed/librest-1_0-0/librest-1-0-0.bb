SUMMARY = "Library to access RESTful web services"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
It is comprised of two parts: \
 \
    * the first aims to make it easier to make requests by providing a \
      wrapper around libsoup. \
    * the second aids with XML parsing by wrapping libxml2."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "librest-1_0-0-0.9.1-3.2.aarch64.rpm"
RPM_HASH = "c3dbe78d8241a03fa2b1451e2f1de2d2c150a38eaf2ad6621132a795371f6fa14e0146c0912f051d44cff3906a91ef052888467ca18176b2b6be73e1a47af2ca"

RPROVIDES:${PN} += "librest-1-0-0 \
librest-1.0.so.0 \
librest-extras-1.0.so.0 \
librest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
