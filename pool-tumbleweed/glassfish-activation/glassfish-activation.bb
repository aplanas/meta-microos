SUMMARY = "JavaBeans Activation Framework"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s)."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-1.2.0-4.3.noarch.rpm"
RPM_HASH = "7057c1b7e9b245dd52e6b04f2090330adddaa8cae1a970a6809492b92129e40c0227d5a16e5ea792134bd8779db8ee94c6cb3a15c1f483680458b6efd59aa900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation \
mvn(com.sun.activation:javax.activation) \
mvn(com.sun.activation:javax.activation:pom:) \
osgi(com.sun.activation.javax.activation)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
