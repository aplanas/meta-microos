SUMMARY = "Javadoc for modello-maven-plugin"
DESCRIPTION = "API documentation for modello-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.0"

RPM_NAME = "modello-maven-plugin-javadoc-2.0.0-3.1.noarch.rpm"
RPM_HASH = "a507dccd233c34faff122043e12bd57444e9e73cb2a8893b65fe947b4be946c539a15aa07401f6cbc1b9b99fd6abd911b87ed69f6d3ed59ba07cf576504fcfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
