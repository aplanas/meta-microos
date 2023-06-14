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

RPM_NAME = "apache-commons-jexl-2.1.1-2.6.noarch.rpm"
RPM_HASH = "aeb6cbafa9c4cf91fac7389e7bf5bf25bab77af6bbbf5f16350c6ba76c39967b488fccade14720b0df1690b0f9f2a2ed7c73d512bded8295cc7a85eae237a347"
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
