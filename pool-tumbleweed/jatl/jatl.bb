SUMMARY = "Java Anti-Template Language"
DESCRIPTION = "Is an extremely lightweight efficient Java library to \
generate XHTML or XML in a micro DSL builder/fluent style."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-0.2.2-3.10.noarch.rpm"
RPM_HASH = "d6367788eaea375dedbd33bee7b89bb5963549563aff574e70e0cc331cc56deae85d1df6aa3b683e85d76c5992cb4740b2bd0b7040865e4210fba76ee3c8ae58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl \
mvn(com.googlecode.jatl:jatl) \
mvn(com.googlecode.jatl:jatl:pom:) \
osgi(com.googlecode.jatl)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-lang:commons-lang)"

inherit rpm
