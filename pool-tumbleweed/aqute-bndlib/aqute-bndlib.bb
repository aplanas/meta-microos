SUMMARY = "BND library"
DESCRIPTION = "BND library."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "aqute-bndlib-5.2.0-3.2.noarch.rpm"
RPM_HASH = "d11892e5e4330903743e5ff187ec567c21494591bbf1b68e796ec531b201fe5fde020c10c5e66fc6fba33c69aafb2c07550091eb52bedabedf95f993a31c9cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bndlib \
mvn-biz.aQute-bndlib \
mvn-biz.aQute-bndlib-pom- \
mvn-biz.aQute.bnd-aQute.libg \
mvn-biz.aQute.bnd-aQute.libg-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.exporters \
mvn-biz.aQute.bnd-biz.aQute.bnd.exporters-pom- \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-biz.aQute.bnd-biz.aQute.bndlib-pom- \
mvn-biz.aQute.bnd-bndlib \
mvn-biz.aQute.bnd-bndlib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-aQute.libg \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
