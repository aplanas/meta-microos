SUMMARY = "Dynamic language for the Java Platform"
DESCRIPTION = "Groovy is an agile and dynamic language for the Java Virtual Machine, \
built upon Java with features inspired by languages like Python, Ruby and \
Smalltalk.  It seamlessly integrates with all existing Java objects and \
libraries and compiles straight to Java byte-code so you can use it anywhere \
you can use Java."
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-1.8.9-7.8.noarch.rpm"
RPM_HASH = "7d095f74e2451a042f3cac75409a2fbd299aaf93998a03612e3e966f5845e681524fe4ecd2dccdde5388e398fb20993ea4c3c0a322d85c844752cb4d05f3da07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-groovy18 \
groovy18"

RDEPENDS:${PN} += "/usr/bin/sh \
glassfish-jsp-api \
glassfish-servlet-api \
groovy18-lib \
mvn-bsf-bsf \
mvn-com.thoughtworks.xstream-xstream \
mvn-commons-cli-commons-cli \
mvn-commons-logging-commons-logging \
mvn-jline-jline \
mvn-junit-junit \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-antlr \
mvn-org.apache.ant-ant-junit \
mvn-org.apache.ant-ant-launcher \
mvn-org.apache.ivy-ivy \
mvn-org.fusesource.jansi-jansi"

inherit rpm
