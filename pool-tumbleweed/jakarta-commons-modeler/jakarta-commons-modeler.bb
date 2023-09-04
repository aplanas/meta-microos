SUMMARY = "Jakarta Commons Modeler Package"
DESCRIPTION = "The Modeler project creates and maintains a set of Java classes to \
provide a number of facilities for Model MBeans plus unit tests and \
small examples of using these facilities to instrument Java classes \
with Model MBean support."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-2.0.1-3.1.noarch.rpm"
RPM_HASH = "b656fcd666223491279f67de463a599a45770da317757159521b59487dfed2feacba97854f3c8074444073bf4ff79ce5d1f0b48daf27b9a57c974443716d5ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-modeler \
commons-modeler \
jakarta-commons-modeler \
mvn-commons-modeler-commons-modeler \
mvn-commons-modeler-commons-modeler-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-digester-commons-digester \
mvn-commons-logging-commons-logging-api"

inherit rpm
