SUMMARY = "Java NFA regular expression engine (demo and samples)"
DESCRIPTION = "Demonstrations and samples for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-demo-1.1.4-293.14.noarch.rpm"
RPM_HASH = "d1fe11d05a6278e2557e8571713fed4354e120a8a54208751bb64ce06965a03f6fd72a46076a40297877f1e205267a3557b2d3fd6c5592d8da09a1b5731b901d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-demo"

RDEPENDS:${PN} += "gnu-getopt \
gnu-regexp"

inherit rpm
