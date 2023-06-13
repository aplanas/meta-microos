SUMMARY = "API documentation, programming language reference, and Qore example programs"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the HTML documentation for the Qore programming language \
and also for user modules delivered with Qore and also example programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-doc-1.13.0-1.4.noarch.rpm"
RPM_HASH = "eaf7608aa549855293b20b6c6f99ab3e5674330d978374616c1e39ce309174a578871df853a33bd945d51e10bb373eb5e6415aa7b9a10064632d339f10b079ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-doc"

RDEPENDS:${PN} += ""

inherit rpm
