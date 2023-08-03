SUMMARY = "C++ API documentation for the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-devel-doc-1.16.1-1.1.noarch.rpm"
RPM_HASH = "d2e1a58f6dd4aabcd32f3b780b8c65ffe2e669abf99f4dbdc44ce0e49755a06f1f4484efb54487aefa2fedf4bbe046425a281dde55fc7cedd1062ba4c80e3432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-devel-doc"

RDEPENDS:${PN} += "libqore12"

inherit rpm
