SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming \
language. It implements a large subset of Tcl and adds new features like \
references with garbage collection, closures, built-in Object Oriented \
Programming system, Functional Programming commands, first-class arrays and \
UTF-8 support."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "jimtcl-0.81-1.4.aarch64.rpm"
RPM_HASH = "670a23f91e1d6c3c9cbe72d468af65a4a80f95a5e415bbd0b9fe8406c224c1fcf18b91d7b860b104d4b78060cf1b8171dc45f1215badf64c98419f136e06d5c4"

RPROVIDES:${PN} += "jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjim.so.0.81"

inherit rpm
