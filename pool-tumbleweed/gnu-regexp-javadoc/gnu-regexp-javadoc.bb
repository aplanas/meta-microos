SUMMARY = "Java NFA regular expression engine (documentation)"
DESCRIPTION = "Javadoc for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-javadoc-1.1.4-293.14.noarch.rpm"
RPM_HASH = "7bc11072afda80665dadd4e6b73d6ef5f5b478bb9e5f773e1d5a6923c37153418c2c3f261648f4e79e40a063a749a135441a7ee1884fa7afc129c8a0c8dd0abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
