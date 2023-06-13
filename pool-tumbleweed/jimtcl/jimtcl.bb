SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming \
language. It implements a large subset of Tcl and adds new features like \
references with garbage collection, closures, built-in Object Oriented \
Programming system, Functional Programming commands, first-class arrays and \
UTF-8 support."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "jimtcl-0.81-1.3.aarch64.rpm"
RPM_HASH = "ae626580c33e18b2b356bb7956877dea50fe8498560336d0ccc7d8354df44029401080af0fc861a4e9a1d81e21a43bd42f1328132ee877844cbc2fb3ca5ab3ed"

RPROVIDES:${PN} += "jimtcl \
jimtcl(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjim.so.0.81()(64bit)"

inherit rpm
