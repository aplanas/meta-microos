SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "librdf0-1.0.17-2.20.aarch64.rpm"
RPM_HASH = "72ad4c83cfe6082d712ff0864c598f2f8f5e7e196b4850627580970534446ad07759d5c30c2d95bdd6f01cca29df4788598b1466048d9b6adb40cb8a5aa25f38"

RPROVIDES:${PN} += "librdf.so.0()(64bit) \
librdf0 \
librdf0(aarch-64) \
libredland0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdb-4.8.so()(64bit) \
libraptor2.so.0()(64bit) \
librasqal.so.3()(64bit)"

inherit rpm
