SUMMARY = "Small XML pull parser"
DESCRIPTION = "kXML is a small XML pull parser, specially designed for constrained \
environments such as Applets, Personal Java or MIDP devices."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-2.3.0-19.10.noarch.rpm"
RPM_HASH = "9588b6316d4ce85fed026f4cc338359e6fb28c6d9224979edce14153a70d3199b53791127fba4f928af03702d545c2ae81f8d6ea50cff9f2ab4fdf454dbe8e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml \
mvn-net.sf.kxml-kxml2 \
mvn-net.sf.kxml-kxml2-min \
mvn-net.sf.kxml-kxml2-min-pom- \
mvn-net.sf.kxml-kxml2-pom- \
osgi-org.kxml2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xpp3"

inherit rpm
