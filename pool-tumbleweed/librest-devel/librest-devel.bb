SUMMARY = "Library to access RESTful web services - Development Files"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "librest-devel-0.9.1-3.1.aarch64.rpm"
RPM_HASH = "2f8546ef1a9cc686f4650cb42e3feb91b83272af564a39a2c5a96d0f0874ee7bdf5d74e2e72445f4bd6ebd4d6c52b14482296adc4ce2927ec2f2afd56ffbb48a"

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
