SUMMARY = "Thrift C++ library development files"
DESCRIPTION = "Thrift C++ library development files \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthrift-devel-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "aa406bb61332a892fc8be3b137ce8a843bf732d799517fdd44db0a66ea75d1d078c25e2a2b1956d7530f697d75868c94a2cd20fe79ada42b55627e9478b57e21"

RPROVIDES:${PN} += "libthrift-devel \
pkgconfig-thrift \
pkgconfig-thrift-c-glib \
pkgconfig-thrift-nb \
pkgconfig-thrift-z"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthrift-0-17-0 \
libthrift-c-glib0 \
libthriftnb-0-17-0 \
libthriftz-0-17-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
