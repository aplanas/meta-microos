SUMMARY = "Jackson module to make integration with Guice a bit easier"
DESCRIPTION = "This extension allows Jackson to delegate ObjectMapper creation and value \
injection to Guice when handling data bindings."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-guice-2.15.2-2.1.noarch.rpm"
RPM_HASH = "30250d078fc9dae794327d72b963161729e7017924f504ca245a9a38cd53a840988f2f393bb8b7acc7afb3eee8de9b02c865ad91c9caa81374d8428b54aae8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-guice"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.inject-guice"

inherit rpm
