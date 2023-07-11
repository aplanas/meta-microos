SUMMARY = "Object transformation library for Java"
DESCRIPTION = "EZMorph is simple java library for transforming an Object to another \
Object. It supports transformations for primitives and Objects and \
multidimensional arrays."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "ezmorph-1.0.6-4.11.noarch.rpm"
RPM_HASH = "3c458e233d4dd2b19338777e342789f396f0decf6624a71e9e00e8b7cc9ad23f69673e078e72381b1af8a364da10f586d4403cea90128ba5176b6b71bcbb7c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ezmorph \
mvn-net.sf.ezmorph-ezmorph \
mvn-net.sf.ezmorph-ezmorph-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang"

inherit rpm
