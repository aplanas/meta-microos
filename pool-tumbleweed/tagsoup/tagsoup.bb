SUMMARY = "A SAX-compliant HTML parser written in Java"
DESCRIPTION = "TagSoup is a SAX-compliant parser written in Java that, instead of \
parsing well-formed or valid XML, parses HTML as it is found in the wild: nasty \
and brutish, though quite often far from short. By providing a SAX interface, \
it allows standard XML tools to be applied to even the worst HTML."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-1.2.1-5.3.noarch.rpm"
RPM_HASH = "ae444cc44c229125b16e90b3324cba63c9916b58a29938604a7d99453085c1e0ef476b6570f1704606fd99fd71333ed9ffb3d7400e9e36c02aadce891f515de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.ccil.cowan.tagsoup:tagsoup) \
mvn(org.ccil.cowan.tagsoup:tagsoup:pom:) \
tagsoup"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
