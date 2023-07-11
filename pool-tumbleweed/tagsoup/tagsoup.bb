SUMMARY = "A SAX-compliant HTML parser written in Java"
DESCRIPTION = "TagSoup is a SAX-compliant parser written in Java that, instead of \
parsing well-formed or valid XML, parses HTML as it is found in the wild: nasty \
and brutish, though quite often far from short. By providing a SAX interface, \
it allows standard XML tools to be applied to even the worst HTML."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-1.2.1-5.4.noarch.rpm"
RPM_HASH = "ee94e02eaad2ab0ff8a3660e90d81bb0387a2af91c0a2323261375262d44ea39b4f7e7af2e72df782718232e65f60146af3d57e815765e584bad5e5eb39e07c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ccil.cowan.tagsoup-tagsoup \
mvn-org.ccil.cowan.tagsoup-tagsoup-pom- \
tagsoup"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
