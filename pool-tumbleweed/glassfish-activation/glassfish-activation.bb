SUMMARY = "JavaBeans Activation Framework"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s)."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-1.2.0-4.4.noarch.rpm"
RPM_HASH = "d2a8161d24a303218c4178d0a60517b9b5f426d97446080827f6fbc5ebace7ea3de3671b191a90686b97da8ee2ec45a5574e17023da834e7865314a4ee7bed55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation \
mvn-com.sun.activation-javax.activation \
mvn-com.sun.activation-javax.activation-pom- \
osgi-com.sun.activation.javax.activation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
