SUMMARY = "API documentation, programming language reference, and Qore example programs"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the HTML documentation for the Qore programming language \
and also for user modules delivered with Qore and also example programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-doc-1.13.0-1.6.noarch.rpm"
RPM_HASH = "f12493759e72829202c5c05b50f5bf94975c0c4558a676abfbabd9a5a6e9545f6f456c8574aa6bb0495c40df633bd157a5e7a935d9df92dd65d02ed89c41c6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-doc"

RDEPENDS:${PN} += ""

inherit rpm
