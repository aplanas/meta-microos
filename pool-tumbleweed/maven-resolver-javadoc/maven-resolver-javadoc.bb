SUMMARY = "API documentation for maven-resolver"
DESCRIPTION = "This package provides API documentation for maven-resolver."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-javadoc-1.9.8-1.1.noarch.rpm"
RPM_HASH = "d815265fe93be0d7a2b4c66d5780452e8ab27ebdf16b6ab8d013f8a104afe7a2785a97af4099845575678946bf2b41452b2fd020a7585b47a959d50ee9159c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
