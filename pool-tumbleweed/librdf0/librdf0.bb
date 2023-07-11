SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "librdf0-1.0.17-2.21.aarch64.rpm"
RPM_HASH = "8b32915a086d19a42631485655ab4c7d2a1f1824b659d764a9d169b81f281d3c7113f92b5094fe515916d0d6e60172985468073556c611734e099f34ddca996b"

RPROVIDES:${PN} += "librdf.so.0 \
librdf0 \
libredland0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libraptor2.so.0 \
librasqal.so.3"

inherit rpm
