SUMMARY = "C++ API documentation for the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-devel-doc-1.13.0-1.4.noarch.rpm"
RPM_HASH = "66219d391151b3702cddff1e64d0d97746532ee85d5954f3b5e37fbcceaa2fcc523cea31c96f74448e570a02484300e55ef92081e1978913bd3a70badbad0000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-devel-doc"

RDEPENDS:${PN} += "libqore12"

inherit rpm
