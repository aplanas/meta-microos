SUMMARY = "API documentation for maven-archetype"
DESCRIPTION = "API documentation for maven-archetype."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-javadoc-3.2.1-1.10.noarch.rpm"
RPM_HASH = "ef498d6e4494c35ced7d9de2b5ef483e2dfe9e39bea0173f5bd51ec3a58dba0d2bf54462ca5bda56aa30a7e810bc0cc5b6ec6a76b0db67c1bffb49b8013a9a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
