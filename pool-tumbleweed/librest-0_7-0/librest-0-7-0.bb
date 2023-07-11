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

PV = "0.8.1"

RPM_NAME = "librest-0_7-0-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "f717e2b8e43ddfce03460ff3d69d859b7e1667764560d5972e2545c9cc52c1b6c859c5d32882c9a9c10c6885688ce60e10f44abb2e2864ab47063c3e4109dc28"

RPROVIDES:${PN} += "librest-0-7-0 \
librest-0.7.so.0 \
librest-extras-0.7.so.0 \
librest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
libxml2.so.2"

inherit rpm
