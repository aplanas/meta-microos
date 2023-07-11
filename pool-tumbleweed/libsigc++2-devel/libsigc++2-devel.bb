SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "libsigc++2-devel-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "2b92c3736a0eea1ff96d86fe995b80276dda924a586442c739ac6816380a15e0d139d60be66e3d9f938ce54b97f1c1937bf39a39993bb179605548cc93f787dc"

RPROVIDES:${PN} += "libsigc++2-devel \
pkgconfig-sigc++-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigc-2-0-0 \
libstdc++-devel"

inherit rpm
