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
libthrift-devel(aarch-64) \
pkgconfig(thrift) \
pkgconfig(thrift-nb) \
pkgconfig(thrift-z) \
pkgconfig(thrift_c_glib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthrift-0_17_0 \
libthrift_c_glib0 \
libthriftnb-0_17_0 \
libthriftz-0_17_0 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
