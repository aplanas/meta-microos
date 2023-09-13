SUMMARY = "Support for using JAXB annotations as an alternative to 'native' Jackson annotations"
DESCRIPTION = "This Jackson extension module provides support for using JAXB (javax.xml.bind) \
annotations as an alternative to native Jackson annotations. It is most often \
used to make it easier to reuse existing data beans that used with JAXB \
framework to read and write XML."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-jaxb-annotations-2.15.2-2.1.noarch.rpm"
RPM_HASH = "a8a9ebcc5ad0e820bf2c57a7467ab9dde87904617e5d0246fbe8fc3061bbd0c922beb67948d6a6cad28e00945ce4497e6939764723655c76d9c9e1209eac7493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-jaxb-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-javax.activation-javax.activation-api \
mvn-javax.xml.bind-jaxb-api"

inherit rpm
