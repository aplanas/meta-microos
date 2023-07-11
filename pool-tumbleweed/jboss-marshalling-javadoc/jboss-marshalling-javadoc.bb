SUMMARY = "API documentation for jboss-marshalling"
DESCRIPTION = "This package contains API documentation for jboss-marshalling."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-javadoc-1.4.11-1.21.noarch.rpm"
RPM_HASH = "8d1d5a9a2eebcccd852cf5fd27937efa72e1228ea69a963daa1e343b9e2930f2ea759a1e45463f8e6e896f5f3afb68c6091f3ecede5ce6e7594605ce25700dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
