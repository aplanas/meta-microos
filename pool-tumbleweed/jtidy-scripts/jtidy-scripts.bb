SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "jtidy-scripts-1.0.4-1.1.noarch.rpm"
RPM_HASH = "c7bb0869591a56572dec055e516dba70602a4d1cdce33fe0bc17180acfb49f91e1a29b824d7f92b5d2f6cd6f704397d3858f1dc1393e0ec5653b5190f54b7dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
javapackages-tools \
jtidy"

inherit rpm
