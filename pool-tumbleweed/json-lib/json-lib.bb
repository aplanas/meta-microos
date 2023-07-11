SUMMARY = "JSON library for Java"
DESCRIPTION = "JSON-lib is a java library for transforming beans, maps, collections, java \
arrays and XML to JSON and back again to beans and DynaBeans."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "json-lib-2.4-6.11.noarch.rpm"
RPM_HASH = "cbde479ca8ad0d5c3952535dc51e643b441b0533a3aab7d27965afe52f62e1b0fb8e01a8200a27dc38984bc27197802003fc5b3bc0d9a6447339607d848c5ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-lib \
mvn-net.sf.json-lib-json-lib \
mvn-net.sf.json-lib-json-lib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-collections-commons-collections \
mvn-commons-lang-commons-lang \
mvn-commons-logging-commons-logging \
mvn-net.sf.ezmorph-ezmorph"

inherit rpm
