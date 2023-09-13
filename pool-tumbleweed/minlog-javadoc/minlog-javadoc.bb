SUMMARY = "Javadoc for minlog"
DESCRIPTION = "This package contains javadoc for minlog."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-javadoc-1.3.1-2.1.noarch.rpm"
RPM_HASH = "5e89b05035890dcf6887d2af2f240e2be5e408b218adedc1dbb0f7f3ceaf53971f7a2bbbaf8ed433dd2e5742eea7cf08368f09aff762d78d24386c93c67428e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
