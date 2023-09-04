SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming \
language. It implements a large subset of Tcl and adds new features like \
references with garbage collection, closures, built-in Object Oriented \
Programming system, Functional Programming commands, first-class arrays and \
UTF-8 support."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "jimtcl-0.82-1.1.aarch64.rpm"
RPM_HASH = "4654c7fdd0aa08cc90eaa9605057ad875c960b546f8b926d9abb2426c20a02c07ce52a3c5dd09cf909c26ff3a54764b4c4b612434a81c19fce9676ecc7170b84"

RPROVIDES:${PN} += "jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjim.so.0.82"

inherit rpm
