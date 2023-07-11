SUMMARY = "JavaBeans Activation Framework API jar"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s). \
 \
This package contains a Java library with only the APIs"
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-api-1.2.0-4.4.noarch.rpm"
RPM_HASH = "d075f22293d14c9927abd02dd2b143cee84e47b688d8268c97dcad50f265be1b79babf32209b19e15c72a32d471df20fa0526d995605af687f940f69df991b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-api \
gnu-jaf \
mvn-javax.activation-activation \
mvn-javax.activation-activation-pom- \
mvn-javax.activation-javax.activation-api \
mvn-javax.activation-javax.activation-api-pom- \
osgi-javax.activation-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
