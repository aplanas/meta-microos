SUMMARY = "Java Expression Language (JEXL)"
DESCRIPTION = "Java Expression Language (JEXL) is an expression language engine which can be \
embedded in applications and frameworks.  JEXL is inspired by Jakarta Velocity \
and the Expression Language defined in the JavaServer Pages Standard Tag \
Library version 1.1 (JSTL) and JavaServer Pages version 2.0 (JSP).  While \
inspired by JSTL EL, it must be noted that JEXL is not a compatible \
implementation of EL as defined in JSTL 1.1 (JSR-052) or JSP 2.0 (JSR-152). \
For a compatible implementation of these specifications, see the Commons EL \
project. \
 \
JEXL attempts to bring some of the lessons learned by the Velocity community \
about expression languages in templating to a wider audience.  Commons Jelly \
needed Velocity-ish method access, it just had to have it."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-jexl-2.1.1-2.7.noarch.rpm"
RPM_HASH = "8a9c49763fb9fea9113512f984390528392edfe13ce47887bd48035857c20af1428aa404678896392dc801be8d96059b2683b891f5c78fbe049f389f86ae5b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jexl \
commons-jexl \
mvn-org.apache.commons-commons-jexl \
mvn-org.apache.commons-commons-jexl-compat \
mvn-org.apache.commons-commons-jexl-compat-pom- \
mvn-org.apache.commons-commons-jexl-pom- \
osgi-org.apache.commons.commons-jexl \
osgi-org.apache.commons.commons-jexl-compat"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
