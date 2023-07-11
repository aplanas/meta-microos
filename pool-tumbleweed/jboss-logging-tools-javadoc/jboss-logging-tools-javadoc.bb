SUMMARY = "Javadoc for jboss-logging-tools"
DESCRIPTION = "This package contains the API documentation for jboss-logging-tools."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-javadoc-2.2.1-2.18.noarch.rpm"
RPM_HASH = "e246f029c789a792225cc4ad880953f88212ff9f02554d36e3889b09217f84d6e1102da7f2afc34b19b99a8a71f2f1fa450da8e2e765272caf54753fbf401ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
