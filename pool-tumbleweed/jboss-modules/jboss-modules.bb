SUMMARY = "A Modular Classloading System"
DESCRIPTION = "Ths package contains A Modular Classloading System."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-1.5.2-1.21.noarch.rpm"
RPM_HASH = "033aea62dbff86334e130d4125eb1f294cd7da5e56e39de4e721877669785b3787877717736ad46ebdcda28df988c0a3a3e691f5efb9bfe98dbb38ec24777cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules \
mvn-org.jboss.modules-jboss-modules \
mvn-org.jboss.modules-jboss-modules-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
