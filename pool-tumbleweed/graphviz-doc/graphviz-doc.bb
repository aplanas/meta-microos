SUMMARY = "Documentation for graphviz"
DESCRIPTION = "Provides some additional PDF and HTML documentation for graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-doc-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "37f7201884e8f6b5a9be73e2212e15dc747e495a94d74070efc24646a7515d6e4fa1da8bffe629a967b6974d5d8cbb9e93032c788bc17818b4a466d2b4516c88"

RPROVIDES:${PN} += "graphviz-doc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/tclsh"

inherit rpm
