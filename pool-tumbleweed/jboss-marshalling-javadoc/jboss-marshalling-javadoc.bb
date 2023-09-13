SUMMARY = "API documentation for jboss-marshalling"
DESCRIPTION = "This package contains API documentation for jboss-marshalling."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-javadoc-1.4.11-2.1.noarch.rpm"
RPM_HASH = "814712ddb359be637c7d51cbcb468c407077b5220e291a1cd60f07cbc00720802afc319c0d0dc8a133fb0236513b514aa6593fda80094114789c495d165602db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
