SUMMARY = "Javadoc for maven-plugin-tools"
DESCRIPTION = "API documentation for maven-plugin-tools."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-javadoc-3.6.0-5.1.noarch.rpm"
RPM_HASH = "469381394ed18b8f49bdd48f848f1c20122c4ab655056cc3a588af8cff067c78f67cc685127325fc0bf43611eb86737d106053f0d582cdb982fa819aff65c082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-javadoc \
maven-plugin-tools-javadocs"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
