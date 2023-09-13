SUMMARY = "Java Anti-Template Language"
DESCRIPTION = "Is an extremely lightweight efficient Java library to \
generate XHTML or XML in a micro DSL builder/fluent style."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-0.2.2-4.1.noarch.rpm"
RPM_HASH = "64b634d37d0662aab04c5e22628adcce44fb34fcff68347dca176508c3e4e10b0125a12305fd10ac2ca56ce73154d915399d40aac801c0c060614e51f4fd99ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl \
mvn-com.googlecode.jatl-jatl \
mvn-com.googlecode.jatl-jatl-pom- \
osgi-com.googlecode.jatl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang"

inherit rpm
