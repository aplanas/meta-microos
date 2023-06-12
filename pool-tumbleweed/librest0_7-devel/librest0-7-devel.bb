SUMMARY = "Library to access RESTful web services - Development Files"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1"

RPM_NAME = "librest0_7-devel-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "f6f272b102ba82f557b998678481a543048450a747c619e5388c13ae5eafa0aedec8a1ef3cd4a9e3f18631f37158db94bab7b28e04d42dd92936d712ff10a05a"

RPROVIDES:${PN} += "librest0_7-devel \
librest0_7-devel(aarch-64) \
pkgconfig(rest-0.7) \
pkgconfig(rest-extras-0.7)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librest-0_7-0 \
pkgconfig(glib-2.0) \
pkgconfig(libsoup-2.4) \
pkgconfig(libxml-2.0) \
typelib-1_0-Rest-0_7"

inherit rpm
