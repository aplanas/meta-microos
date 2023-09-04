SUMMARY = "Eclipse Compiler for Java"
DESCRIPTION = "ECJ is the Java bytecode compiler of the Eclipse Platform.  It is also known as \
the JDT Core batch compiler."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "4.23"

RPM_NAME = "ecj-4.23-2.1.noarch.rpm"
RPM_HASH = "63bf6900cd7aa8b539a6edc9f6b215e992be719662a8056c2f1460b03245712273b0a70f273a7e1890ce08c3c4a5f421dabe1b53fc42a580d5cc793ddf324275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecj \
mvn-org.eclipse.jdt-core \
mvn-org.eclipse.jdt-core-pom- \
mvn-org.eclipse.jdt-ecj \
mvn-org.eclipse.jdt-ecj-pom- \
mvn-org.eclipse.jdt.core.compiler-ecj \
mvn-org.eclipse.jdt.core.compiler-ecj-pom- \
mvn-org.eclipse.tycho-org.eclipse.jdt.compiler.apt \
mvn-org.eclipse.tycho-org.eclipse.jdt.compiler.apt-pom- \
mvn-org.eclipse.tycho-org.eclipse.jdt.core \
mvn-org.eclipse.tycho-org.eclipse.jdt.core-pom- \
osgi-org.eclipse.jdt.core.compiler.batch"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
