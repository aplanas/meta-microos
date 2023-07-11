SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "redland-1.0.17-2.21.aarch64.rpm"
RPM_HASH = "6ba8465f9751d8d9d7d5cd9b8700c1f9c07034a2fd3a917beee1a97d34fa1929b99571f28043fdf59e182cae92a0310862ba5435285739f91b97638cebc9bd5a"

RPROVIDES:${PN} += "librdf-storage-sqlite.so \
redland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0 \
librdf.so.0 \
libsqlite3.so.0"

inherit rpm
