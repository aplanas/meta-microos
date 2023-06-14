SUMMARY = "Object transformation library for Java"
DESCRIPTION = "EZMorph is simple java library for transforming an Object to another \
Object. It supports transformations for primitives and Objects and \
multidimensional arrays."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "ezmorph-1.0.6-4.10.noarch.rpm"
RPM_HASH = "c5412ab3184c02e748ea27b307878a891b0198bb16506bb76d84e6b6fa420abc040683a5e4576534f1d259c3503e8d620ece273b0c0197744978023706517111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ezmorph \
mvn-net.sf.ezmorph-ezmorph \
mvn-net.sf.ezmorph-ezmorph-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang"

inherit rpm
