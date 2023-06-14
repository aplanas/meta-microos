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

RPM_NAME = "libthrift-devel-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "e813d41c7b77f3f2e716e1a7b7056635ecae84177725e7ba8d0744e556741216a0fb748c72851c429654ccd7a7df084e85886c2aac2e09ec4443babc509f312f"

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
