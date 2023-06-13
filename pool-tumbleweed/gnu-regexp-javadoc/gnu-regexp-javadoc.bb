SUMMARY = "Java NFA regular expression engine (documentation)"
DESCRIPTION = "Javadoc for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-javadoc-1.1.4-293.13.noarch.rpm"
RPM_HASH = "88cac184a73ea7bebd623380d70ab7e2a181eb2e901d54a3192c9f449d7786a1908e3e1a8d5153edefcb34e1fee98191a2c445a781678537162698401cb25af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
