SUMMARY = "Library to access RESTful web services - Development Files"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "librest-devel-0.9.1-3.2.aarch64.rpm"
RPM_HASH = "d53afcfa96863d96ffe9879129dda26abf3373f200d4de5be17c040e41dd12afb89135bf4898a851cf0167e324549a4d852d13167ef1bd381d789fcd5138de2b"

RPROVIDES:${PN} += "librest-devel \
pkgconfig-rest-1.0 \
pkgconfig-rest-extras-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librest-1-0-0 \
pkgconfig-glib-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-rest-1.0 \
typelib-1-0-Rest-1-0"

inherit rpm
