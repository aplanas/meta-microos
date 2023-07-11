SUMMARY = "Codemodel Annotation Compiler"
DESCRIPTION = "The annotation compiler ant task for the CodeModel java source code \
generation library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-annotation-compiler-2.3.1-4.5.noarch.rpm"
RPM_HASH = "fb3522820ab3b1686ca4484ad9f62a89220fcf46848d6f55da68853d2e48a777807e9816d34d8c96a5fb46957d96fa6317196ca584e655b16cda676c57409704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-annotation-compiler \
mvn-org.glassfish.jaxb-codemodel-annotation-compiler \
mvn-org.glassfish.jaxb-codemodel-annotation-compiler-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-tools \
mvn-org.glassfish.jaxb-codemodel"

inherit rpm
