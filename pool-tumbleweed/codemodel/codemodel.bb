SUMMARY = "Java library for code generators"
DESCRIPTION = "CodeModel is a Java library for code generators; it provides a way to \
generate Java programs in a way much nicer than PrintStream.println(). \
This project is a spin-off from the JAXB RI for its schema compiler \
to generate Java source files."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-2.6-4.5.noarch.rpm"
RPM_HASH = "f5f43cf8dd8560370127804577e8df3e50034ef7734f3b5c4be653ced97550d8ec1d323f73e1dc2cba7a248b8c5d1ca5845c75d25f426208c8e0797fce47cc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codemodel \
mvn-com.sun.codemodel-codemodel \
mvn-com.sun.codemodel-codemodel-annotation-compiler \
mvn-com.sun.codemodel-codemodel-annotation-compiler-pom- \
mvn-com.sun.codemodel-codemodel-pom- \
mvn-com.sun.codemodel-codemodel-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
