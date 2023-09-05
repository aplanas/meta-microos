SUMMARY = "C++ API documentation for the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides HTML documentation for the C++ API for the Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-devel-doc-1.18.1-1.1.noarch.rpm"
RPM_HASH = "6000748c753f63fd2ed07c5fcdd2a8047045981dc6629f3b4a229b0615c89f78f34e611efae4a93ef1e4c671aff6a8756d5c8ef2c55b2a2774788c0303f038e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
