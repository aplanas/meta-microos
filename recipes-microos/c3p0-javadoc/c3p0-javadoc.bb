SUMMARY = "Javadoc for c3p0"
DESCRIPTION = "Javadoc documentation for c3p0."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.5.5"

RPM_NAME = "c3p0-javadoc-0.9.5.5-4.8.noarch.rpm"
RPM_HASH = "5d01b993caf8b8b4607d3ceb9354ca6f3b3da40f5bb9565598a0dbf7e5da05341f1e5b00b68077329ec60f6627961ca4294fe4ac5782672dec10795b696c8fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
