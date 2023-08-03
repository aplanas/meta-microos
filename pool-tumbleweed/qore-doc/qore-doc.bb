SUMMARY = "API documentation, programming language reference, and Qore example programs"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the HTML documentation for the Qore programming language \
and also for user modules delivered with Qore and also example programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-doc-1.16.1-1.1.noarch.rpm"
RPM_HASH = "f1b4243124fae26d56a4e5b3b4ea4ccac3a1955c004f68f81f831f698ad1669bec68932abfdfc2217d462cbe645bb82e05e4cb3e6bca642c4ed1417d2aac8a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-doc"

RDEPENDS:${PN} += ""

inherit rpm
