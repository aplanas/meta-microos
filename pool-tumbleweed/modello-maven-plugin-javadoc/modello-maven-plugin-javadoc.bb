SUMMARY = "Javadoc for modello-maven-plugin"
DESCRIPTION = "API documentation for modello-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.0"

RPM_NAME = "modello-maven-plugin-javadoc-2.0.0-3.2.noarch.rpm"
RPM_HASH = "20f442cc366739b341ff5d51ee9abd6185277c473cca7c7743b1cb5c11c64f3ac144a807e87c116f370ecac1c0bdfbc50bd1ef508441f32903fe836e89228c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
