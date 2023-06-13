SUMMARY = "Documentation for graphviz"
DESCRIPTION = "Provides some additional PDF and HTML documentation for graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-doc-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "ecdaa4fb6fc213e5b1e7fa1db5def91ba883526a1de1c7a3fa0fa57fd0ddd83b422399961e54bc83fdddcba7d180ed9f86e5103083c785587cbc95ae29521c26"

RPROVIDES:${PN} += "graphviz-doc \
graphviz-doc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/lua5.1 \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/ruby \
/usr/bin/tclsh"

inherit rpm
