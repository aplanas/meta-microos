SUMMARY = "Freepascal Compiler - sources"
DESCRIPTION = "The fpc-src package contains the sources of Freepascal, for \
documentation or automatical-code generation purposes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-src-3.2.2-3.9.aarch64.rpm"
RPM_HASH = "fef54f860d3cf659cb6a2ffa450b5d9b45f23a4dd4fcd97f3dc1a1f2578afd53bf639f831f4416a9bf8a8694dca7b251440be68a3b0fe3770e866403fad8319b"

RPROVIDES:${PN} += "fpc-src fpc-src(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/csh /bin/sh /usr/bin/env"

inherit rpm
