SUMMARY = "Eclipse Compiler for Java"
DESCRIPTION = "ECJ is the Java bytecode compiler of the Eclipse Platform.  It is also known as \
the JDT Core batch compiler."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "4.18"

RPM_NAME = "ecj-4.18-4.5.noarch.rpm"
RPM_HASH = "d9f2bc1508e548745f92d36b10ea8afb9100eaf02069f132278ebdf61098e816347d1df9cdea265e11765f6e0f79e12e4c70cf94bf03ccb2ebc4651b8653b42d"
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
