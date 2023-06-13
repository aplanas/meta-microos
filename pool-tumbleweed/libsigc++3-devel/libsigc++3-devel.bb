SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "libsigc++3-devel-3.2.0-1.6.aarch64.rpm"
RPM_HASH = "b660885833ae30ae87bac7d625b145c479cf6aed0a6582b64e85004ffaf148aeb437e0af8bfe001bb62718f8837151e04103ff75a760b3d63667d16f8dddf7c7"

RPROVIDES:${PN} += "libsigc++3-devel \
libsigc++3-devel(aarch-64) \
pkgconfig(sigc++-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigc-3_0-0 \
libstdc++-devel"

inherit rpm
