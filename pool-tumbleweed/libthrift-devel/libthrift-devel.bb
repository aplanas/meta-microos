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

RPM_NAME = "libthrift-devel-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "2c66a7b62abbd31456d90cd0f983c3c86007952f1ea263ccca58ca038cea8aac39e6f1f1a4269d438082779a82cc630a92b97b024d7fce2c8d2957bcab2991ca"

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
