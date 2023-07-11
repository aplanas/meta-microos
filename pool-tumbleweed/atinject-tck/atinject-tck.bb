SUMMARY = "TCK for testing atinject compatibility with JSR-330"
DESCRIPTION = "TCK for testing atinject compatibility with JSR-330."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-tck-1+20160610git1f74ea7-2.7.noarch.rpm"
RPM_HASH = "c056a7479a57bd08f3e335aa66416bd60a8325bcec5977b52c5836303c8a24bf463afdcf34201bbfef1f9255b8b5326eaea6c3828854639e92b3db6099c9bd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject-tck \
mvn-javax.inject-javax.inject-tck \
mvn-javax.inject-javax.inject-tck-pom- \
osgi-com.google.code.atinject.tck"

RDEPENDS:${PN} += "atinject \
java-headless \
javapackages-filesystem \
junit \
mvn-javax.inject-javax.inject \
mvn-junit-junit \
osgi-org.junit"

inherit rpm
