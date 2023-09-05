SUMMARY = "API documentation, programming language reference, and Qore example programs"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the HTML documentation for the Qore programming language \
and also for user modules delivered with Qore and also example programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-doc-1.18.1-1.1.noarch.rpm"
RPM_HASH = "2b587393fef94cae625ad7f3aa71db9489b476f19752010e728faf982d2fd083a36a5d1d9b57550bd54251cf5f4f94444e5e81b5f05dd33873e84e45d71e076f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-doc"

RDEPENDS:${PN} += ""

inherit rpm
