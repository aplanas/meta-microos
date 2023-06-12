SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "libsigc++2-devel-2.12.0-1.1.aarch64.rpm"
RPM_HASH = "7dc5748194b731b13398a3b07c77b8d48f528b9ffa0088649fb15706daa37659fdead281d88789977ec6d1f9440de3e3fac08413e490f7c8e929c1045ccbc657"

RPROVIDES:${PN} += "libsigc++2-devel \
libsigc++2-devel(aarch-64) \
pkgconfig(sigc++-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigc-2_0-0 \
libstdc++-devel"

inherit rpm
