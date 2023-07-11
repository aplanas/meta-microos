SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "libsigc-2_0-0-2.12.0-1.2.aarch64.rpm"
RPM_HASH = "99523c317dd94534d21fe5902978a308fa1872ae2c070108d3ed2bdd050272bf0f3c08ab91150dae6c08f0762edf697d879847cf48db19af1dba2d4aef279c27"

RPROVIDES:${PN} += "libsigc++2 \
libsigc-2-0-0 \
libsigc-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
