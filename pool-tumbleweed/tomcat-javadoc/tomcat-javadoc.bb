SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-javadoc-9.0.75-1.1.noarch.rpm"
RPM_HASH = "8a0217873f9fb24d7ab22f1cc46a0acdbde5ce3cfe0ff32340629aef67486e74fd1dd079555563d25ae2326753cfd8a688bdfba7e2b71fbc77eb797c828e7a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
