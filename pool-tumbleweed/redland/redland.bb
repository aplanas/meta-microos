SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "redland-1.0.17-2.20.aarch64.rpm"
RPM_HASH = "5afd67de2fd6c4ba696d92e9893e11195ec91527237470bc682d833be5581e0f536d86eeb3675b1e69eea3a31c8acd159890118ddc0424b33d3965e27f19d1e9"

RPROVIDES:${PN} += "librdf-storage-sqlite.so \
redland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0 \
librdf.so.0 \
libsqlite3.so.0"

inherit rpm
