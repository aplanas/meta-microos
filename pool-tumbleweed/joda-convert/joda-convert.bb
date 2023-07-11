SUMMARY = "Java library for conversion to and from standard string formats"
DESCRIPTION = "Java library to enable conversion to and from standard string formats."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "joda-convert-1.9.2-3.7.noarch.rpm"
RPM_HASH = "1fdc40247e11dc038640710bfd49c0b302ff962fc61878ceb14afc61a9026b929a8b1576039348886a1ee5259c7e815d52d324a0dcf559ed39afae9bd903e785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert \
mvn-org.joda-joda-convert \
mvn-org.joda-joda-convert-pom- \
osgi-org.joda.convert"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
