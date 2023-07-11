SUMMARY = "JSS Connector for Apache Tomcat"
DESCRIPTION = "JSS Connector for Apache Tomcat, installed via the tomcatjss package, \
is a Java Secure Socket Extension (JSSE) module for Apache Tomcat that \
uses Java Security Services (JSS), a Java interface to Network Security \
Services (NSS)."
LICENSE = "LGPL-2.0-or-later"

PV = "7.4.1"

RPM_NAME = "tomcatjss-7.4.1-2.7.noarch.rpm"
RPM_HASH = "07889a92b7dcbd8517453876f4556f38708961d7e94ae73c4021013354fded688dfcebd43f518933a4229e7103f49182d6b936dba3054f61ffd95946e721e3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcatjss"

RDEPENDS:${PN} += "apache-commons-lang \
mozilla-jss \
slf4j \
slf4j-jdk14 \
tomcat"

inherit rpm
