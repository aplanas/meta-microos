SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-javadoc-9.0.75-1.2.noarch.rpm"
RPM_HASH = "e27d9e2d0c23e0070e19b7349b6629b09aa3ab4b3c438440654995f7354b81fdec38e3b4ca7ebb44e30be57eb142fc3208b4d4a8d6e5b494288a402091c6b75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
