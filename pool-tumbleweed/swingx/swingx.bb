SUMMARY = "A collection of Swing components"
DESCRIPTION = "SwingX contains a collection of powerful, useful, and just plain fun Swing \
components. Each of the Swing components have been extended, providing \
data-aware functionality out of the box. New useful components have been \
created like the JXDatePicker, JXTaskPane, and JXImagePanel."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-1.6.5.1-1.11.noarch.rpm"
RPM_HASH = "92f0c8a5245582c104f0e4c84c6df0f974148ce3268f9ef737dfe89bc3eba8aad576d326c552b665ca4d222e9741b9f94ccac23d01f14ab8ee6fa28a3a8c8ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.swinglabs.swingx-swingx-action \
mvn-org.swinglabs.swingx-swingx-action-pom- \
mvn-org.swinglabs.swingx-swingx-all \
mvn-org.swinglabs.swingx-swingx-all-pom- \
mvn-org.swinglabs.swingx-swingx-autocomplete \
mvn-org.swinglabs.swingx-swingx-autocomplete-pom- \
mvn-org.swinglabs.swingx-swingx-beaninfo \
mvn-org.swinglabs.swingx-swingx-beaninfo-pom- \
mvn-org.swinglabs.swingx-swingx-common \
mvn-org.swinglabs.swingx-swingx-common-pom- \
mvn-org.swinglabs.swingx-swingx-core \
mvn-org.swinglabs.swingx-swingx-core-pom- \
mvn-org.swinglabs.swingx-swingx-graphics \
mvn-org.swinglabs.swingx-swingx-graphics-pom- \
mvn-org.swinglabs.swingx-swingx-mavensupport \
mvn-org.swinglabs.swingx-swingx-mavensupport-pom- \
mvn-org.swinglabs.swingx-swingx-painters \
mvn-org.swinglabs.swingx-swingx-painters-pom- \
mvn-org.swinglabs.swingx-swingx-plaf \
mvn-org.swinglabs.swingx-swingx-plaf-pom- \
mvn-org.swinglabs.swingx-swingx-project-pom- \
swingx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
