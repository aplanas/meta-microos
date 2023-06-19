SUMMARY = "Eclipse Compiler for Java"
DESCRIPTION = "ECJ is the Java bytecode compiler of the Eclipse Platform.  It is also known as \
the JDT Core batch compiler."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "4.18"

RPM_NAME = "ecj-4.18-4.4.noarch.rpm"
RPM_HASH = "54f9e36f8cd2ab1a805b5c5ab0ff274d3653540a71ef0f1c3341d27f3eccab42bb8506590e81406e6a93dae470163a927447274a02d07e6ea4abb0f1c852527e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecj \
mvn-org.eclipse-java10api \
mvn-org.eclipse-java15api \
mvn-org.eclipse-java9api \
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
