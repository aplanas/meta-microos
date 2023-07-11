SUMMARY = "Documentation for graphviz"
DESCRIPTION = "Provides some additional PDF and HTML documentation for graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-doc-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "f0ea97853f0f6fcb86650b6c6bc456dc4c3626e70218087628728802225c25fa2083fd5c31fd694327d4e755c5d3f03189426b77db71ca73eb0954d671a188d4"

RPROVIDES:${PN} += "graphviz-doc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/lua5.1 \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/tclsh"

inherit rpm
