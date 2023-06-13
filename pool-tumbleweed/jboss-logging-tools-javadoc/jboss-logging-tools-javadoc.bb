SUMMARY = "Javadoc for jboss-logging-tools"
DESCRIPTION = "This package contains the API documentation for jboss-logging-tools."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-javadoc-2.2.1-2.17.noarch.rpm"
RPM_HASH = "230043dda59fcd4a1898445d450c088922debb707791b670bd382919698034ea920a80291cb7cb67e80d54508db4af5f43ed62ee43b03130d4dd8087c839ddc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
