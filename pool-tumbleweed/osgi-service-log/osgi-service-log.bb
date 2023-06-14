SUMMARY = "OSGi Service Log"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.log Version 1.5.0."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-1.5.0-1.3.noarch.rpm"
RPM_HASH = "fef22ec9c07130b65b0b09db21a25d7e8848ef85460c8bd2e84c8faf89bc0711af672b7149a4b30328873d0b42c5aecfc3fc7f8c0c57ea5179f7129de0a49e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.log \
mvn-org.osgi-org.osgi.service.log-pom- \
osgi-org.osgi.service.log \
osgi-service-log"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
