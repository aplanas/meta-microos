SUMMARY = "Java library for code generators"
DESCRIPTION = "CodeModel is a Java library for code generators; it provides a way to \
generate Java programs in a way much nicer than PrintStream.println(). \
This project is a spin-off from the JAXB RI for its schema compiler \
to generate Java source files."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-2.6-4.4.noarch.rpm"
RPM_HASH = "114b3344669f74d4c01efcaffe32db7779be2a2118d145ad8b1dd1490484f4fc5de6fec96729a9f59724c1c973104a0c03d68e5b0dbedd967afca84f937f2314"
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
